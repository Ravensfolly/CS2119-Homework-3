package hw3package;
import java.util.GregorianCalendar;

/**
 * Abstract class Event
 * @author Caroline and Nathaniel
 * cpbreen@wpi.edu
 * nsbajakian@wpi.edu
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
	public String toString()
	{
		int month = this.date.get(GregorianCalendar.MONTH);
		int day   = this.date.get(GregorianCalendar.DAY_OF_MONTH);
		int year  = this.date.get(GregorianCalendar.YEAR);
		return "Contact information: \n" + this.person.toString() + 
				"\nDate of the meeting: " + month + "/" + day + "/" + year;
	}
	
	public String retDate() {
		int month = this.date.get(GregorianCalendar.MONTH);
		int day   = this.date.get(GregorianCalendar.DAY_OF_MONTH);
		int year  = this.date.get(GregorianCalendar.YEAR);
		int hour  = this.date.get(GregorianCalendar.HOUR_OF_DAY);
		return "Date of the meeting: " + month + "/" + day + "/" + year + ", @" + hour;
	}
	
	/**
	 * Retrieves the date of an event
	 * @return event's date
	 */
	public GregorianCalendar getDate()
	{
		return this.date;
	}
	
	public Contact getContact() {
		return this.person;
	}
}
