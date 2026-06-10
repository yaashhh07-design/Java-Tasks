import java.util.Scanner;
class Task12
{
 public static void main(String args[])
 {
	System.out.println("\nRight Inverted Triangle Pattern :");
	for(int i=1;i<=5;i++)
	{
	 for(int j=1;j<i;j++)
	 {
		System.out.print("* ");
	 }
	 System.out.println();
	}
	System.out.println("\nInverted Triangle Pattern :");
	for(int i=5;i>=1;i--)
	{
	 for(int j=1;j<i;j++)
	 {
		System.out.print("* ");
	 }
	 System.out.println();
	}
	System.out.println("\nRight Inverted Pattern in Number :");
	for(int i=1;i<=5;i++)
	{
	 for(int j=1;j<i;j++)
	 {
		System.out.print(j+" ");
	 }
	 System.out.println();
	}
	System.out.println("\nInverted Triangle Pattern in Number :");
	for(int i=5;i>=1;i--)
	{
	 for(int j=1;j<i;j++)
	 {
		System.out.print(j+" ");
	 }
	 System.out.println();
	}
 }
}