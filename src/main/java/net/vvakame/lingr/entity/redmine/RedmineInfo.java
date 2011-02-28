package net.vvakame.lingr.entity.redmine;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

/**
 * 部屋毎のRedmineについての情報を保持.<br>
 * Keyの内容<br>
 * name=room
 * @author vvakame
 */
@Model
public class RedmineInfo {

	@Attribute(primaryKey = true)
	Key key;

	String baseUrl;


	/**
	 * @return the key
	 * @category accessor
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 * @category accessor
	 */
	public void setKey(Key key) {
		this.key = key;
	}

	/**
	 * @return the baseUrl
	 * @category accessor
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * @param baseUrl the baseUrl to set
	 * @category accessor
	 */
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}
