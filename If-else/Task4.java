import java.util.Scanner;
class Task4
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter the Marks of Computer Science :");
 int marks=obj.nextInt();
 if(marks>50)
 {
 System.out.println("Student has passed in Computer Science");
 }
 else
 {
 System.out.println("Student has failed in Computer Science");
 }
 }
}