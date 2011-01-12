package net.vvakame.lingr.controller.redmine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.json.JSONObject;
import net.vvakame.lingr.entity.redmine.Event;
import net.vvakame.lingr.entity.redmine.LingrPush;
import net.vvakame.lingr.entity.redmine.LingrPushGen;
import net.vvakame.util.jsonpullparser.JsonPullParser;

import org.slim3.controller.Navigation;
import org.slim3.controller.SimpleController;

public class IndexController extends SimpleController {

	static final Logger logger = Logger.getLogger(IndexController.class.getName());


	@Override
	protected Navigation run() throws Exception {

		String asString = streamAsString(request.getInputStream());

		if (asString == null) {
			return null;
		}

		if (asString.startsWith("json=")) {
			asString = asString.substring(5);
			asString = URLDecoder.decode(asString, "utf-8");
		} else {
			return null;
		}

		JSONObject json = JSONObject.fromObject(asString);
		logger.log(Level.INFO, asString);

		if (!"ok".equals(json.getString("status"))) {
			response.getWriter().println("unexpected error.");
			response.flushBuffer();
			throw new IllegalStateException();
		}

		JsonPullParser parser = JsonPullParser.newParser(asString);
		LingrPush lingr = LingrPushGen.get(parser);

		response.setCharacterEncoding("utf-8");

		for (Event event : lingr.getEvents()) {
			String text = event.getMessage().getText();
			response.getWriter().println(text);
		}

		return null;
	}

	String streamAsString(InputStream is) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			builder.append(line).append("\n");
		}

		return builder.toString();
	}
}
