import java.util.Scanner;
class Task10
{
 public static void main(String args[])
 {
	 Scanner obj=new Scanner(System.in);
	 System.out.print("Enter the number:");
	 int a=obj.nextInt();
	 int b=0;
	 int temp=a;
	 while(a>0)
	 {
	  int c=a%10;
	  b=b*10+c;
	  a=a/10;
	 }
	 System.out.println("\nNumber :"+temp);
	 System.out.println("Reversed Number :"+b);
	 if(b==temp)
	 {
	 System.out.println("\nIt is a Palindrome");
	 }
	 else
	 {
	 System.out.println("\nIt is not a Palindrome");
	 }
 }
}