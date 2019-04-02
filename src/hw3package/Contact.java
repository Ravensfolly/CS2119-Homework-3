package hw3package;
/**
 * Contact class
 * @author Caroline and Nathaniel
 */
public class Contact {

	private String name;
	private int tele;
	
	/**
	 * Constructor for a contact.
	 * @param name
	 * @param tele
	 */
	public Contact(String name, int tele) {
		this.name = name;
		this.tele = tele;
		
	}
	
	/**
	 * Turns the current contact into a string format, stating their name and phone number.
	 * @return contact's name and phone number in string format
	 */
	public String toString() {
		String output = new String("Contact's name: " + this.name + "\nContact's phone number: " + this.tele);	
		return output;
	}
	
	/**
	 * Retrieves the name of the given contact
	 * @return contact's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Retrieves the phone number of the given contact
	 * @return contact's phone number
	 */
	public int getPhone() {
		return this.tele;
	}
	
}
