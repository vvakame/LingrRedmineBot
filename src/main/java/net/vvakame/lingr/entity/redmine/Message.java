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

	@JsonKey
	String text;

	@JsonKey
	String timestamp;


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
}
