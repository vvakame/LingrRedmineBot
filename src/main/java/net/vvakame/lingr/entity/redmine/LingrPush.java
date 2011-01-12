package net.vvakame.lingr.entity.redmine;

import java.util.List;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

@JsonModel
public class LingrPush {

	@JsonKey
	String status;

	@JsonKey
	long counter;

	@JsonKey
	List<Event> events;


	/**
	 * @return the status
	 * @category accessor
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 * @category accessor
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the counter
	 * @category accessor
	 */
	public long getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 * @category accessor
	 */
	public void setCounter(long counter) {
		this.counter = counter;
	}

	/**
	 * @return the events
	 * @category accessor
	 */
	public List<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 * @category accessor
	 */
	public void setEvents(List<Event> events) {
		this.events = events;
	}
}
