class Test
{
	int a;
	Test(int i)
	{
		a=i;
	}
	Test incbyten()
	{
		Test temp=new Test(a+10);
		return temp;	
	}
}
class ab
{
	public static void main(String args[])
	{
		Test obj1=new Test(2);
		System.out.println(obj1.a);
		Test obj2;
		obj2=obj1.incbyten();
		System.out.println(obj2.a);
		Test obj3;
		obj3=obj2.incbyten();
		System.out.println(obj3.a);
	}
}
	