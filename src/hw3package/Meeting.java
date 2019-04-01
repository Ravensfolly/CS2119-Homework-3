package hw3package;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Meeting class, extends the abstract Event class
 * @author Caroline and Nathaniel
 */
public class Meeting extends Event
{
	private ArrayList<String> names;
	
	/**
	 * Constructor for a meeting.
	 * @param person
	 * @param date
	 */
	Meeting(Contact person, GregorianCalendar date)
	{
		super(person, date);
		this.names = new ArrayList<String>();
	}
	
	/**
	 * Adds the given name onto the already existing list of people attending the meeting.
	 * @param newName
	 */
	public void addAttendee(String newName)
	{
		this.names.add(newName);
	}
	
	/**
	 * Retrieves the list of people attending the meeting.
	 * @return people attending meeting
	 */
	public ArrayList<String> getAttendees()
	{
		return this.names;
	}
	
}