import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Meeting extends Event
{
	private Contact person;
	private GregorianCalendar date;
	private ArrayList<String> names;
	
	Meeting(Contact person, GregorianCalendar date)
	{
		this.person = person;
		this.date = date;
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
	
	
	public ArrayList<String> getAttendees()
	{
		return this.names;
	}
	
}