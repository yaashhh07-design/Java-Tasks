import java.util.Scanner;
class Task2
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter a number :");
 int a=obj.nextInt();
 int sq=a*a;
 
 if(sq>50)
 {
 System.out.println("Number is above 50");
 }
 else
 {
 System.out.println("Number is below 50");
 }
 }
}