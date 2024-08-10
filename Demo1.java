class Park
{
	int length, breadth, height;
	double area;
	Park (int length, int breadth, int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.area = Area();
	}
	double Area()
	{
		return length*breadth;
	}
	void display()
	{

		System.out.println("Length: "+length+"m"+"\nBreadth: "+breadth+"m"+"\nHeight: "+height+"m");
		System.out.println("Area: "+area+"m^2");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		Park park=new Park(7, 4, 6);
		park.display();
	}
}