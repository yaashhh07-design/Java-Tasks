import java.util.Scanner;
class Task1
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the number of Integers :");
	int n=obj.nextInt();
	int even=0,odd=0;
	System.out.println("Enter the Integers :");
	for(int i=0;i<n;i++)
	{
		int num=obj.nextInt();
		if(num%2 == 0)
		{
			even+=num;
		}
		else
		{
			odd+=num;
		}
	}
	System.out.println("Sum of the Even Integers :"+even);
	System.out.println("Sum of the Odd Integers :"+odd);
 }
}