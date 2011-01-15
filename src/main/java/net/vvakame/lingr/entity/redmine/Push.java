package net.vvakame.lingr.entity.redmine;

import java.util.List;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

/**
 * @author vvakame
 */
@JsonModel
public class Push {

	@JsonKey
	List<Event> events;


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
