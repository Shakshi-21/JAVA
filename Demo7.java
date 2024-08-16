class Addition
{
	int sum(int a, int b)
	{
		return a+b;
	}
	double sum(double a, double b)
	{
		return a+b;
	}
	float sum(float a, float b)
	{
		return a+b;
	}  
	long sum(long a, long b)
	{
		return a+b;
	}
	//short sum(short a, short b)
	/*{
		return (short)(a+b);
	}
	byte sum(byte a, byte b)
	{
		return (byte)(a+b);
	}*/
}	
class Demo7
{
 	public static void main(String args[])
	{
		Addition Add=new Addition();

		int intadd=Add.sum(200, 130);  //Two int
		System.out.println("Sum of two int value: "+intadd);

		double doubleadd=Add.sum(200.57, 130.8);  //Two double 
		System.out.println("Sum of two double value: "+doubleadd);

		float floatadd=Add.sum(200.57f, 130.8f);   //Two float
		System.out.println("Sum of two float value: "+floatadd);

		long longadd=Add.sum(200L, 130L);   //Two long
		System.out.println("Sum of two long value: "+longadd);

		//short shortadd=Add.sum((short)100, (short)20);   //Two short
		//System.out.println("Sum of two short value: "+shortadd);

		//byte byteadd=Add.sum((byte)100, (byte)20);   //Two byte
		//System.out.println("Sum of two byte value: "+byteadd);
	}
}