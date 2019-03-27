import java.util.ArrayList;

public class AppointmentBook 
{

	private ArrayList<Event> events;
	
	AppointmentBook(ArrayList<Event> events)
	{
		this.events = events;
	}
	
	public void addEvent(Event anEvent)
	{
		this.events.add(anEvent);
	}
}
