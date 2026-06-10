import java.util.Scanner;
class Task9
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the number :");
	int num=obj.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			sum+=i;
		}
	}
	System.out.println("\nSum of the Devicers :"+sum);
 }
}