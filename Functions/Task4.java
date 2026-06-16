import java.util.Scanner;
class SpyNumber
{
	void checkSpy(int a)
	{
		int temp=a,sum=0,digit,product=1;
		while(a>0)
		{
			digit=a%10;
			sum+=digit;
			product*=digit;
			a/=10;
		}
		System.out.println("\nSum of the Digits :"+sum);
		System.out.println("Product of the Digits :"+product);
		if(sum==product)
		{
			System.out.println(temp+" is SpyNumber Number!");
		}
		else
		{
			System.out.println(temp+" is not SpyNumber Number!");
		}
	}
}
class Task4

{
	public static void main(String args[])
	{
		SpyNumber obj1=new SpyNumber();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter the Number to find SpyNumber or Not? :");
		int x=obj2.nextInt();
		obj1.checkSpy(x);
	}
}