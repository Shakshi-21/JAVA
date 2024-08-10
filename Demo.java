class Television
{
	String make, Date_of_Purchase;
	int size_of_screen;
	boolean isColourTV;
	Television (String make, String Date_of_Purchase, int size_of_screen, Boolean isColourTV) //Using a Constructor
	{
		this.make = make;
		this.Date_of_Purchase = Date_of_Purchase;
		this.size_of_screen = size_of_screen;
		this.isColourTV =isColourTV;
	}
	void display() //Display the attributes
	{
		System.out.println("Make: "+make+"\nDate of Purchase: "+Date_of_Purchase+"\nSize of the screen: "+size_of_screen+" inches"+"\nIs it a Colour TV?: "+(isColourTV?"Yes":"No"));
	}
}
class Demo 
{
	public static void main(String args[])
	{
		Television tv=new Television("Panasonic", "04/05/2024", 42, true);
		tv.display();
	}
}