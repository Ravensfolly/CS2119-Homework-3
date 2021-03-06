package hw3package;
import java.util.GregorianCalendar;

/**
 * Appointment class, extends the Event class
 * @author Caroline and Nathaniel
 * cpbreen@wpi.edu
 * nsbajakian@wpi.edu
 */
public class Appointment extends Event
{
	private String type;
	
	/**
	 * Constructor for an appointment
	 * @param person
	 * @param date
	 * @param type
	 */
	public Appointment(Contact person, GregorianCalendar date, String type)
	{
		super(person, date);
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
	
	public String toString() 
	{
		return super.toString() + "\nType of meeting: " + this.type;
	}
}
