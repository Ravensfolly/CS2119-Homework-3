import java.util.GregorianCalendar;

public class Appointment extends Event
{
	private Contact person;
	private GregorianCalendar date;
	private String type;
	
	Appointment(Contact person, GregorianCalendar date, String type)
	{
		this.person = person;
		this.date = date;
		this.type = type;
	}
	
	/**
	 * Retrieves the type of appointment that is made.
	 * @return type of appointment
	 */
	public String getType()
	{
		return this.type;
	}
}
