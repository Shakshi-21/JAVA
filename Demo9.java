class Box
{ 	
	double height, width, depth;
	Box(int len)
	{
		this.height=len;
		this.width=len;
		this.depth=len;
	}
	Box(double height, double width, double depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;		
	}
	void volume()
	{
		System.out.println("Volume of the box is :"+height*width*depth);
	}
}
class Demo9
{
	public static void main(String args[])
	{
		Box ob1=new Box(20);
		Box ob2=new Box(15, 32, 22);
		ob1.volume();
		ob2.volume();
	}
}