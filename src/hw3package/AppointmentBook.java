package hw3package;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * AppointmentBook class
 * @author Caroline and Nathaniel
 * cpbreen@wpi.edu
 * nsbajakian@wpi.edu
 *
 */
public class AppointmentBook 
{

	private ArrayList<Event> events;
	
	/**
	 * Constructor for an appointment book.
	 */
	public AppointmentBook()
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
		boolean canAdd = false;
		boolean flag = true;
		
		if(this.events.size() == 0) {
			this.events.add(e);
		}
		
		else {
			for(Event i : this.events)
			{
				//checking to see if the event is on the same day as the events already existing in the list
				if((e.getDate().get(GregorianCalendar.DAY_OF_MONTH) == i.getDate().get(GregorianCalendar.DAY_OF_MONTH)) && flag) 
				{
					//checking to make sure that the time is not already taken by any already existing event
					int time1 = e.getDate().get(GregorianCalendar.HOUR_OF_DAY);
					int time2 = i.getDate().get(GregorianCalendar.HOUR_OF_DAY);
					
					if(time1 != time2) {
						canAdd = true;
					}
					
					else if ((e.getDate().get(GregorianCalendar.YEAR) == i.getDate().get(GregorianCalendar.YEAR))
						&&   (e.getDate().get(GregorianCalendar.MONTH) == i.getDate().get(GregorianCalendar.MONTH))) {
						canAdd = false;
						flag = false;
					}
				}
				
				else {
					canAdd = true;
				}
			}
			
			if(canAdd) {
				this.events.add(e);
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
	
	public void printEvents() {
		System.out.println("Now printing out all events");
		for(Event i: this.events) {
			System.out.println(i.retDate());
		}
	}
}