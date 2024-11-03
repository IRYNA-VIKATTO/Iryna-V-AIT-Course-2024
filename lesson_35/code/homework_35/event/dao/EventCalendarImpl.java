package homework_35.event.dao;

import homework_35.event.model.Event;


import java.time.LocalDateTime;
import java.util.Arrays;


public class EventCalendarImpl implements EventCalendar{

    private Event[] events;
    private int size;

    public EventCalendarImpl(int capacity) {
        this.events = new Event[capacity];
        this.size = 0;
    }

    @Override
    public boolean addEvent(Event event) {
        if (event == null || size == events.length) {
            return false;
        }

        if (getEvent(event.getEventId()) != null) {
            return false; // Проверка на дублирование по ID события
        }

        events[size++] = event;
        return true;
    }

    @Override
    public boolean removeEvent(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                System.arraycopy(events, i + 1, events, i, size - i - 1);
                events[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateEvent(int eventId, String description, LocalDateTime dateTime) {
        Event event = getEvent(eventId);
        if (event != null) {
            event.setDescription(description);
            event.setDateTime(dateTime);
            return true;
        }
        return false;
    }

    @Override
    public Event getEvent(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                return events[i];
            }
        }
        return null;
    }
    @Override
    public Event[] getEventsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return Arrays.stream(events, 0, size)
                .filter(event -> event.getDateTime().isAfter(dateFrom) && event.getDateTime().isBefore(dateTo))
                .toArray(Event[]::new);
    }

    @Override
    public int size() {
        return size;
    }
}



