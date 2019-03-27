import java.util.ArrayList;
import java.util.GregorianCalendar;

public abstract class Event 
{
	private Contact person;
	private GregorianCalendar date;
	
	Event(Contact person, GregorianCalendar date)
	{
		this.person = person;
		this.date = date;
	}
	//Hello there Nathaniel, Destroyer of Worlds and Minds and spelling sHUT UP BREEN
	public String toString(Event anEvent)
	{
		String output = new String("Contact information: /n" + this.person.toString(this.person) + "/n Date of the meeting: " + this.date);
		return output;
	}
}
