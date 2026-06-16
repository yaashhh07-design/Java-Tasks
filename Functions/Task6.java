import java.util.Scanner;
class SplitDigits
{
	void SquareDigits(int a)
	{
		int digit;
		while(a>0)
		{
			digit=a%10;
			System.out.print(digit*digit+" ");
			a/=10;
		}
	}
}
class Task6
{
	public static void main(String args[])
	{
		SplitDigits obj1=new SplitDigits();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter The Number to SplitDigits And Square :");
		int x=obj2.nextInt();
		obj1.SquareDigits(x);
	}
}