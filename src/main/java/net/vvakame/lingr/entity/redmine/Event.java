package net.vvakame.lingr.entity.redmine;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

@JsonModel
public class Event {

	@JsonKey
	Message message;

	@JsonKey("event_id")
	long eventId;


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

	/**
	 * @return the eventId
	 * @category accessor
	 */
	public long getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 * @category accessor
	 */
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
}
