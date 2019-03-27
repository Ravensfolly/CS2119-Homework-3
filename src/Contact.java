
public class Contact
{

	private String name;
	private int tele;
	
	Contact(String name, int tele)
	{
		this.name = name;
		this.tele = tele;
		
	}
	
	public String toString(Contact person)
	{
		
		String output = new String("Contact's name: " + this.name + "/n Contact's phone number: " + this.tele);
		
		return output;
	}
	
	/**
	 * Retrieves the name of the given contact
	 * @return contact's name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Retrieves the phone number of the given contact
	 * @return contact's phone number
	 */
	public int getPhone()
	{
		return this.tele;
	}
	
}
