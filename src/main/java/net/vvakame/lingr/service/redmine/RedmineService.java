package net.vvakame.lingr.service.redmine;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.appengine.repackaged.com.google.common.collect.Lists;

/**
 * Redmineに関わる操作.
 * @author vvakame
 */
public class RedmineService {

	private static final Pattern TICKET_PATTERN = Pattern.compile("#([0-9]+)");


	/**
	 * 文字列に含まれるチケット番号の一覧を取得し返します.
	 * @param text
	 * @return チケット番号の一覧
	 * @author vvakame
	 */
	public static List<Integer> extractTicketId(String text) {
		List<Integer> result = Lists.newArrayList();
		Matcher matcher = TICKET_PATTERN.matcher(text);
		while (matcher.find()) {
			String str = matcher.group(1);
			result.add(Integer.parseInt(str));
		}

		return result;
	}

	/**
	 * チケット番号からURLを取得します.
	 * @param ticketId
	 * @return URL
	 * @author vvakame
	 */
	public static String getTicketAddress(int ticketId) {
		return null;
	}
}
