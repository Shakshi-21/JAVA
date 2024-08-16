import java.lang.Math;
class Test
{
	public double area(double radius)
	{
		double ar=Math.PI*Math.pow(radius, 2);
		return ar;
	}
	public double area(double length, double breadth)
	{
		double ar=length*breadth;
		return ar;
	}
	public float area(float side)
	{
		float ar=side*side;
		return ar;
	}
}
class Demo6
{
	public static void main(String args[])
	{
	 	Test obj=new Test();	
		double ar1=obj.area(20);
		double ar2=obj.area(45, 30);
		double ar3=obj.area(50);
		System.out.println("The area of the circle: "+ar1);
		System.out.println("The area of the rectangle: "+ar2);
		System.out.println("The area of the square: "+ar3);
	}
}