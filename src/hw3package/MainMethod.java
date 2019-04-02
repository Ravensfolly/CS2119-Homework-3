package hw3package;
import java.util.GregorianCalendar;
import java.util.ArrayList;
public class MainMethod {

	public static void main(String[] args) {
		
		/* This program checks the syntax of your constructors and methods.
		 * Your classes MUST compile with this program, with no errors.
		 */
		
		// check constructors
		Contact glynis = new Contact("Glynis", 8315252);
		GregorianCalendar today = new GregorianCalendar(2019, 3, 29, 16, 0);
		Meeting m = new Meeting(glynis, today);
		Appointment a = new Appointment (glynis, today, "office hour");
		AppointmentBook book = new AppointmentBook();
		
		//Following tests were made in collaboration with Team 1030. Some similarities may be presetn.
		GregorianCalendar today1 = new GregorianCalendar(2019, 3, 29, 11, 0);
		GregorianCalendar today2 = new GregorianCalendar(2019, 3, 29, 13, 0);
		GregorianCalendar today3 = new GregorianCalendar(2019, 3, 29, 14, 0);
		GregorianCalendar today4 = new GregorianCalendar(2019, 3, 29, 16, 0);
		
		
		Contact rosana   = new Contact("Rosana", 9211423);
		Contact shauna   = new Contact("Shauna", 7069091);
		Contact caroline = new Contact("Caroline", 7069091);
		Contact nate     = new Contact("Nate",     1239857);
		Meeting m1 = new Meeting(glynis, today1);
		Meeting m2 = new Meeting(rosana, today3);
		//System.out.println("\n\nMeeting 1: " + m1);
		//System.out.println("Meeting 2: " + m2);
		
		Appointment a1 = new Appointment(shauna, today2, "office hour");
		Appointment a2 = new Appointment(caroline, today4, "class");
		Appointment a3 = new Appointment(nate, today4, "CS 2119 class");
		//System.out.println("\n\nAppt 1: " + a1);
		//System.out.println("Appt 2: " + a2);
		//System.out.println("Appt 3: " + a3);
		
		AppointmentBook help = new AppointmentBook();
		
		m1.addAttendee("Ron");
		m1.addAttendee("Caroline");
		m1.addAttendee("The Greatest Human: Nate");
		
		help.addEvent(a1);
		help.addEvent(a2);
		help.addEvent(a3); //This should not be added
		
		help.addEvent(m1);
		help.addEvent(m2);
		
		help.printEvents();
		
		System.out.println("*********************************\n"
				          +"*********************************");
		//**************End of similarities with Team 1030.**************
		
		
		
		// check Contact methods
		String name = glynis.getName();
		System.out.println(name);
		int phoneNum = glynis.getPhone();
		System.out.println(phoneNum);
		name = glynis.toString();
		System.out.println(name);
		
		// check Appointment methods
		name = a.getType();
		System.out.println("Appt type: " + name);
		name = a.toString();
		System.out.println("---------------\n" + a);
		
		// check Meeting methods
		m.addAttendee("Joe");
		@SuppressWarnings("unused")
		ArrayList<String> people = m.getAttendees();
		name = m.toString();
		System.out.println("---------------\n" + name);
		
		// check AppointmentBook methods
		book.addEvent(a);
		book.addEvent(m);
		@SuppressWarnings("unused")
		ArrayList<Event> todaysEvents = book.getEventsForDate(today);
	
		System.out.println("---------------\nCompiles OK!");
	}
}