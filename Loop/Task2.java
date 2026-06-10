import java.util.Scanner;
class Task2
{
 public static void main(String args[])
 {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the positive Integer :");
	int num=obj.nextInt();
	System.out.print("How many times Should the Table run :");
	int n=obj.nextInt();
	if(num<=0)
	{
		System.out.println("The Integer is Negative , Enter positive Integer");
	}
	else
	{
		System.out.println("\nMultiplication Table of "+num);
	}
	for(int i=1;i<=n;i++)
	{
		System.out.println(i+" x "+num+" = "+(num*i));
	}
 }
}