import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Abstract class Event
 * @author Caroline and Nathaniel
 */
public abstract class Event 
{
	private Contact person;
	private GregorianCalendar date;
	
	/**
	 * Constructor for and Event.
	 * @param person
	 * @param date
	 */
	Event(Contact person, GregorianCalendar date)
	{
		this.person = person;
		this.date = date;
	}
	
	/**
	 * Consumes an event and converts it into a string, stating the contact information and the date of the event,
	 * whether it be an appointment or a meeting.
	 * @param anEvent
	 * @return contact information and the date of the event in a string format
	 */
	public String toString(Event anEvent)
	{
		String output = new String("Contact information: /n" + this.person.toString() + "/n Date of the meeting: " + this.date);
		return output;
	}
	
	/**
	 * Retrieves the date of an event
	 * @return event's date
	 */
	public GregorianCalendar getDate()
	{
		return this.date;
	}
}
