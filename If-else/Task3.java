import java.util.Scanner;
class Task3
{
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter a for 'A' :");
	int a=obj.nextInt();
	System.out.print("Enter a for 'B' :");
	int b=obj.nextInt();
	System.out.println("A :"+a);
	System.out.println("B :"+b);
	int c=a-b;
	if(c==0)
	{
	System.out.println("Difference of two number is Zero :"+c);
	}
	else
	{
	System.out.println("Difference of two number is Not Zero :"+c);
	}
	}
}