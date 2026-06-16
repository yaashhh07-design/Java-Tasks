import java.util.Scanner;
class SplitDigits
{
	void splitDigits(int a)
	{
		while(a>0)
		{
			System.out.print(a%10+" ");
			a/=10;
		}
	}
}
class Task3
{
	public static void main(String args[])
	{
		SplitDigits obj1=new SplitDigits();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter The FourDigit Number to SplitDigits :");
		int x=obj2.nextInt();
		obj1.splitDigits(x);
	}
}