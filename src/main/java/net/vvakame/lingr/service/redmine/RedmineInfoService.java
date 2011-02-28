package net.vvakame.lingr.service.redmine;

import net.vvakame.lingr.entity.redmine.RedmineInfo;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

/**
 * {@link RedmineInfo} に関する処理をまとめたクラス.
 * @author vvakame
 */
public class RedmineInfoService {

	static Key createKey(String room) {
		return Datastore.createKey(RedmineInfo.class, room);
	}

	/**
	 * {@link RedmineInfo} を取得する.
	 * @param room
	 * @return {@link RedmineInfo}
	 * @author vvakame
	 */
	public static RedmineInfo get(String room) {
		Key key = createKey(room);
		return Datastore.getOrNull(RedmineInfo.class, key);
	}

	/**
	 * {@link RedmineInfo} を取得する.
	 * @param key 
	 * @return {@link RedmineInfo}
	 * @author vvakame
	 */
	public static RedmineInfo get(Key key) {
		return Datastore.getOrNull(RedmineInfo.class, key);
	}

	/**
	 * 指定されたroomで利用されているRedmineのbaseUrlを設定する.
	 * @param room
	 * @param baseUrl
	 * @author vvakame
	 */
	public static void regist(String room, String baseUrl) {
		RedmineInfo info = get(room);
		if (info == null) {
			info = new RedmineInfo();
			info.setKey(createKey(room));
			info.setBaseUrl(baseUrl);
		}
		Datastore.put(info);
	}
}
