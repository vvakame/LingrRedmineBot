package net.vvakame.lingr.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.json.JSONObject;
import net.vvakame.lingr.entity.redmine.Push;
import net.vvakame.lingr.entity.redmine.PushGen;
import net.vvakame.util.jsonpullparser.JsonPullParser;

import org.slim3.controller.Navigation;
import org.slim3.controller.SimpleController;

/**
 * Lingrでの発言を受け取り下処理を行います
 * @author vvakame
 */
public abstract class LingrControllerBase extends SimpleController {

	static final Logger logger = Logger.getLogger(LingrControllerBase.class.getName());


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

		logger.log(Level.INFO, asString);
		JSONObject json = JSONObject.fromObject(asString);

		if (!"ok".equals(json.getString("status"))) {
			response.getWriter().println("unexpected error.");
			response.flushBuffer();
			throw new IllegalStateException();
		}

		response.setCharacterEncoding("utf-8");

		JsonPullParser parser = JsonPullParser.newParser(asString);
		Push push = PushGen.get(parser);

		process(push);

		return null;
	}

	/**
	 * Lingrに対するレスポンス
	 * @param cs
	 * @throws IOException
	 * @author vvakame
	 */
	public void responceWrite(CharSequence cs) throws IOException {
		response.getWriter().print(cs.toString());
	}

	/**
	 * Lingrに返したい発言を処理してください
	 * @param push
	 * @return {@link Navigation}
	 * @author vvakame
	 * @throws IOException 
	 */
	public abstract Navigation process(Push push) throws IOException;

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
