package net.vvakame.lingr.entity.redmine;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

/**
 * @author vvakame
 */
@JsonModel
public class Message {

	@JsonKey
	String id;

	@JsonKey
	String room;

	@JsonKey("public_session_id")
	String publicSessionId;

	@JsonKey("icon_url")
	String iconUrl;

	@JsonKey
	String type;

	@JsonKey("speaker_id")
	String speakerId;

	@JsonKey
	String nickname;

	@JsonKey
	String text;

	@JsonKey
	String timestamp;

	@JsonKey("local_id")
	String localId;


	/**
	 * @return the id
	 * @category accessor
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 * @category accessor
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the room
	 * @category accessor
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 * @category accessor
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * @return the publicSessionId
	 * @category accessor
	 */
	public String getPublicSessionId() {
		return publicSessionId;
	}

	/**
	 * @param publicSessionId the publicSessionId to set
	 * @category accessor
	 */
	public void setPublicSessionId(String publicSessionId) {
		this.publicSessionId = publicSessionId;
	}

	/**
	 * @return the iconUrl
	 * @category accessor
	 */
	public String getIconUrl() {
		return iconUrl;
	}

	/**
	 * @param iconUrl the iconUrl to set
	 * @category accessor
	 */
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	/**
	 * @return the type
	 * @category accessor
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 * @category accessor
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the speakerId
	 * @category accessor
	 */
	public String getSpeakerId() {
		return speakerId;
	}

	/**
	 * @param speakerId the speakerId to set
	 * @category accessor
	 */
	public void setSpeakerId(String speakerId) {
		this.speakerId = speakerId;
	}

	/**
	 * @return the nickname
	 * @category accessor
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 * @category accessor
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the text
	 * @category accessor
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 * @category accessor
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the timestamp
	 * @category accessor
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 * @category accessor
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the localId
	 * @category accessor
	 */
	public String getLocalId() {
		return localId;
	}

	/**
	 * @param localId the localId to set
	 * @category accessor
	 */
	public void setLocalId(String localId) {
		this.localId = localId;
	}
}
