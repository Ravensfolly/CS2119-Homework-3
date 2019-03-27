import java.util.GregorianCalendar;
import java.util.ArrayList;
public class HW3StubDemo {

	public static void main(String[] args) {
		
		/* This program checks the syntax of your constructors and methods.
		 * Your classes MUST compile with this program, with no errors.
		 * Do not change any of the code in this program.
		 */
		
		// check constructors
		Contact glynis = new Contact("Glynis", 8315252);
		GregorianCalendar today = new GregorianCalendar(2019, 3, 29, 16, 0);
		Meeting m = new Meeting(glynis, today);
		Appointment a = new Appointment (glynis, today, "office hour");
		AppointmentBook book = new AppointmentBook();
		
		// check Contact methods
		String name = glynis.getName();
		int phoneNum = glynis.getPhone();
		name = glynis.toString();
		
		// check Appointment methods
		name = a.getType();
		name = a.toString();
		
		// check Meeting methods
		m.addAttendee("Joe");
		ArrayList<String> people = m.getAttendees();
		name = m.toString();
		
		// check AppointmentBook methods
		book.addEvent(a);
		book.addEvent(m);
		ArrayList<Event> todaysEvents = book.getEventsForDate(today);
		
		
		System.out.println("Compiles OK");
		

	}

}