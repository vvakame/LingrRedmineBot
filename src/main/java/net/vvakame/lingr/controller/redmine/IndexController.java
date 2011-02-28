package net.vvakame.lingr.controller.redmine;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import net.vvakame.lingr.controller.LingrControllerBase;
import net.vvakame.lingr.entity.redmine.RedmineInfo;
import net.vvakame.lingr.jsonmodel.redmine.Event;
import net.vvakame.lingr.jsonmodel.redmine.Push;
import net.vvakame.lingr.service.redmine.RedmineInfoService;
import net.vvakame.lingr.service.redmine.RedmineService;

import org.slim3.controller.Navigation;

/**
 * Lingrでの発言を受け取りRedmineの情報を手繰って発言します.
 * @author vvakame
 */
public class IndexController extends LingrControllerBase {

	static final Logger logger = Logger.getLogger(IndexController.class.getName());


	@Override
	public Navigation process(Push push) throws IOException {
		String room = push.getEvents().get(0).getMessage().getRoom();
		for (Event event : push.getEvents()) {
			String text = event.getMessage().getText();
			String baseUrl = RedmineService.extractBaseUrl(text);
			if (baseUrl != null) {
				RedmineInfoService.regist(room, baseUrl);
			}
		}

		RedmineInfo info = RedmineInfoService.get(room);
		if (info == null) {
			responceWrite("input Redmine base url." + "\n");
			responceWrite("format: >>Redmine 'http://redmine.example.com/'");
		} else {
			for (Event event : push.getEvents()) {
				String text = event.getMessage().getText();
				List<Integer> list = RedmineService.extractTicketId(text);
				for (int i : list) {
					String url = info.getBaseUrl() + i;
					logger.info(url);
					responceWrite(url + "\n");
				}
			}
		}

		return null;
	}
}
