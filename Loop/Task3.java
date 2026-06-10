import java.util.Scanner;
class Task3
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the factorial number :");
	int num=obj.nextInt();
	long factorial=1;
	for(int i=1;i<=num;i++)
	{
		factorial*=i;
	}
	System.out.println("\nFactorial of "+num+" is "+factorial);
 }
}