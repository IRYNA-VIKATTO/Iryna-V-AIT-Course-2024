package homework_35.event.test;

import homework_35.event.dao.EventCalendar;
import homework_35.event.dao.EventCalendarImpl;
import homework_35.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EventCalendarTest {
    private EventCalendar eventCalendar;
    private Event[] events;
    private LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        eventCalendar = new EventCalendarImpl(5);
        events = new Event[4];
        events[0] = new Event(1, "Meeting", now.minusDays(10));
        events[1] = new Event(2, "Conference", now.minusDays(5));
        events[2] = new Event(3, "Workshop", now.minusDays(2));
        events[3] = new Event(4, "Presentation", now.plusDays(3));

        for (Event event : events) {
            eventCalendar.addEvent(event);
        }
    }

    @Test
    void addEvent() {
        assertFalse(eventCalendar.addEvent(null), "Should return false for null event");
        assertFalse(eventCalendar.addEvent(events[1]), "Should return false for duplicate event");
        Event newEvent = new Event(5, "Webinar", now.plusDays(4));
        assertTrue(eventCalendar.addEvent(newEvent), "Should successfully add a new event");
        assertEquals(5, eventCalendar.size(), "EventCalendar size should be 5 after adding an event");

        Event extraEvent = new Event(6, "Seminar", now.plusDays(5));
        assertFalse(eventCalendar.addEvent(extraEvent), "Should not add an event beyond capacity");
    }

    @Test
    void removeEvent() {
        assertTrue(eventCalendar.removeEvent(1), "Should successfully remove the event with eventId 1");
        assertFalse(eventCalendar.removeEvent(5), "Should return false for non-existent event");
        assertEquals(3, eventCalendar.size(), "EventCalendar size should be 3 after removal");
    }

    @Test
    void updateEvent() {
        assertTrue(eventCalendar.updateEvent(1, "Updated Meeting", now.minusDays(9)), "Should successfully update the event description and date");
        assertEquals("Updated Meeting", eventCalendar.getEvent(1).getDescription(), "Event description should be updated to 'Updated Meeting'");
    }

    @Test
    void getEvent() {
        assertEquals(events[1], eventCalendar.getEvent(2), "Should retrieve the correct event by eventId");
        assertNull(eventCalendar.getEvent(5), "Should return null for non-existent event");
    }

    @Test
    void getAllEventsOnDate() {
    }

    @Test
    void getEventsBetweenDates() {
        LocalDateTime startDate = now.minusDays(6);
        LocalDateTime endDate = now.minusDays(1);

        Event[] expected = {events[1], events[2]};
        Event[] actual = eventCalendar.getEventsBetweenDates(startDate, endDate);

        assertArrayEquals(expected, actual, "Should retrieve events within the specified date range");
    }

    @Test
    void size() {
        assertEquals(4, eventCalendar.size(), "Initial size of EventCalendar should be 4");
    }
}