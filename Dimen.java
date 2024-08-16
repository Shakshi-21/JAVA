class Box
{
	double side, length, breadth, height;
	Box(double side)
	{
		this.length=side;
		this.breadth=side;
		this.height=side;
	}
	Box(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=1;	
	}
	Box(double length, double breadth, double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	double volume()
	{
		return length*breadth*height;
	}
	void display()
	{
		System.out.println("Dimensions: "+length+" x "+breadth+" x "+height);
		System.out.println("Volume: "+volume());	
	}
}
class Dimen
{
	public static void main(String args[])
	{
		Box obj1=new Box(6);
		System.out.println("---Volume of Box1---");
		obj1.display();
		Box obj2=new Box(15, 20);
		System.out.println("---Volume of Box2---");
		obj2.display();
		Box obj3=new Box(10, 20, 30);
		System.out.println("---Volume of Box3---");
		obj3.display();
	}
}