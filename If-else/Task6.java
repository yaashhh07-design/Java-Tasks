import java.util.Scanner;
class Task6
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter a Two-digit number :");
 int num=obj.nextInt();
 System.out.println("Two-digit number is :"+num);
 int tens=num/10;
 int ones=num%10;
 if(tens>ones)
 {
 System.out.println("Biggest digit is :"+tens);
 }
 else
 {
 System.out.println("Biggest digit is :"+ones);
 }
 }
}