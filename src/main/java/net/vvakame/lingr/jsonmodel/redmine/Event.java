package net.vvakame.lingr.jsonmodel.redmine;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

/**
 * @author vvakame
 */
@JsonModel
public class Event {

	@JsonKey
	Message message;


	/**
	 * @return the message
	 * @category accessor
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 * @category accessor
	 */
	public void setMessage(Message message) {
		this.message = message;
	}
}
