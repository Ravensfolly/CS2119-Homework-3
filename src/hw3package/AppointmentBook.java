package hw3package;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * AppointmentBook class
 * @author Caroline and Nathaniel
 *
 */
public class AppointmentBook 
{

	private ArrayList<Event> events;
	
	/**
	 * Constructor for an appointment book.
	 */
	AppointmentBook()
	{
		this.events = new ArrayList<Event>();
	}
	
	/**
	 * Adds an event to the existing list in the Appointment Book, as long as the event does not conflict with one that already exists.
	 * Note that events only last for one hour and always start on the hour.
	 * @param e
	 */
	public void addEvent(Event e)
	{
		for(Event i : events)
		{
			//checking to see if the event is on the same day as the events already existing in the list
			if(e.getDate().get(GregorianCalendar.DAY_OF_MONTH) == i.getDate().get(GregorianCalendar.DAY_OF_MONTH)) 
			{
				//checking to make sure that the time is not already taken by any already existing event
				if(e.getDate().get(GregorianCalendar.HOUR_OF_DAY) != i.getDate().get(GregorianCalendar.HOUR_OF_DAY)) 
				{
					this.events.add(e);
				}
			}
		}
		
	}
	
	/**
	 * Takes in a given date and checks through the Appointment book to see if any of the events fall on the given day.
	 * If they do then it adds that event onto a list that will then be printed out.
	 * @param date
	 * @return list of all the events on the given day
	 */
	public ArrayList<Event> getEventsForDate(GregorianCalendar date)
	{
		ArrayList<Event> dayEvents = new ArrayList<Event>(); //initializes the list that will be printed
		
		for(Event e : this.events) 
		{
			if(e.getDate() == date)
			{
				dayEvents.add(e);
			}
		}
		return dayEvents;
	}
}