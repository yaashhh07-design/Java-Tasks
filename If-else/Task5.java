import java.util.Scanner;
class Task5
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter a number :");
 int a=obj.nextInt();
 if(a%10==0)
 {
 System.out.println("It is Divisible by 10");
 }
 else
 {
 System.out.println("It is not Divisible by 10");
 }
 }
}