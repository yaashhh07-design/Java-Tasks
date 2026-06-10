import java.util.Scanner;
class Task10
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter a Character :");
 char ch=obj.next().charAt(0);
 if(ch>='A' && ch<='Z')
 {
 System.out.println("It is a Capital Letter :"+ch);
 }
 else
 {
 System.out.println("It is not a Capital Letter :"+ch);
 }
 }
}