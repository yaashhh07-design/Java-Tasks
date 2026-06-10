import java.util.Scanner;
class Task8
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
	 sum+=digit;
	 num/=10;
	}
	System.out.println("Sum :"+sum);
	if(orginal%sum==0)
	{
	System.out.println("\n"+orginal+" is a Harshad number");
	}
	else
	{
	System.out.println("\n"+orginal+" is not a Harshad number");
	}
 }
}