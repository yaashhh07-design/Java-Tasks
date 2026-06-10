import java.util.Scanner;
class Task11
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the number :");
	int num=obj.nextInt();
	int orginal=num;
	int sum=0;
	while(num>0)
	{
	 int digit=num%10;
	 sum+=digit*digit*digit;
	 num/=10;
	}
	System.out.println("Sum :"+sum);
	if(orginal==sum)
	{
	System.out.println("\n"+orginal+" is a Armstrong number");
	}
	else
	{
	System.out.println("\n"+orginal+" is not a Armstrong number");
	}
 }
}