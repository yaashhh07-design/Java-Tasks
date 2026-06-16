import java.util.Scanner;
class CountDigits
{
	void countDigits(int a)
	{
		int count=0;
		while(a>0)
		{
			count++;
			a/=10;
		}
		System.out.println("\nNumber of Digits :"+count);
	}
}
class Task7
{
	public static void main(String args[])
	{
		CountDigits obj1=new CountDigits();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter a Number :");
		int x=obj2.nextInt();
		obj1.countDigits(x);
	}
}