class Box
{
	double length, breadth, height;
	Box(double length, double breadth, double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	double Volume()
	{
		return length*breadth*height;
	} 
}
class Demo8
{
	public static void main(String args[])
	{
		Box box1=new Box(20, 25, 30);
		Box box2=new Box(25, 20, 35);
		double Volume1=box1.Volume();
		double Volume2=box2.Volume();
		System.out.println("Volume of the Box 1: "+Volume1+" m^3"+"\nVolume of the Box 2: "+Volume2+" m^3");

		if(Volume1>Volume2)
			System.out.println("Box 1 has bigger size");
		else if(Volume1<Volume2)
			System.out.println("Box 2 has bigger size");
		else
			System.out.println("Both Boxes have the same size");
	}
}