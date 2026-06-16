import java.util.Scanner;
class SumFunction
{
	void Sum(int a,double b)
	{
		double result=a+b;
		System.out.println("\nSum :"+result);
	}
}
class Task11
{
	public static void main(String args[])
	{
		SumFunction obj1=new SumFunction();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter a Number in Integer :");
		int x=obj2.nextInt();
		System.out.print("Enter a Number in Double :");
		double y=obj2.nextDouble();
		obj1.Sum(x,y);
		
	}
}