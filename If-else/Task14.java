import java.util.Scanner;
class Task14
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 double fine=0;
 System.out.print("Enter the number of days Late :");
 int days=obj.nextInt();
 if(days<=5)
 {
 fine=days*0.40;
 }
 else if(days<=10)
 {
 fine=(days*0.40)+(days-5)*0.65;
 }
 else
 {
 fine=(days*0.40)+(days*0.65)+(days-10)*0.80;
 }
 System.out.println("Fine Amount to be paid "+fine+"paisa");
 }
}