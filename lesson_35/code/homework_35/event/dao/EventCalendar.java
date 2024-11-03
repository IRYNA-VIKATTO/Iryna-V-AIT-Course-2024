package homework_35.event.dao;

import homework_35.event.model.Event;


import java.time.LocalDateTime;

public interface EventCalendar {

    boolean addEvent(Event event);

    boolean removeEvent(int eventId);

    boolean updateEvent(int eventId, String description, LocalDateTime dateTime);

    Event getEvent(int eventId);

    Event[] getEventsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo);

    int size();

}
