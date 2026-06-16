import java.util.Scanner;
class Divisors
{
	void PrintSumOfDivisors(int a)
	{
		int sum=0;
		
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					System.out.print(i+" ");
					sum+=i;
				}
			}
		System.out.println("\nSum of the Digits :"+sum);
	}
}
class Task8
{
	public static void main(String args[])
	{
		Divisors obj1=new Divisors();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter a Number :");
		int x=obj2.nextInt();
		obj1.PrintSumOfDivisors(x);
	}
}