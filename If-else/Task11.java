import java.util.Scanner;
class Task11
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter a Number :");
 int a=obj.nextInt();
 int b=a*a;
 int c=b%10;
 if(a==c)
 {
 System.out.println("It is an Automorphic Number");
 }
 else
 {
 System.out.println("It is not an Automorphic Number");
 }
 }
}