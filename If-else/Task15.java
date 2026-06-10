import java.util.Scanner;
class Task15
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter the number of 'a' :");
 double a=obj.nextDouble();
 System.out.print("Enter the number of 'b' :");
 double b=obj.nextDouble();
 System.out.print("Enter the operator [+,-,*,/] :");
 char op=obj.next().charAt(0);
 if(op=='+')
 {
 double c=a+b;
 System.out.println("A :"+a+"\n"+"B :"+b);
 System.out.println("Addition :"+c);
 }
 else if(op=='-')
 {
 double d=a+b;
 System.out.println("A :"+a+"\n"+"B :"+b);
 System.out.println("Subraction :"+d);
 }
 else if(op=='*')
 {
 double e=a*b;
 System.out.println("A :"+a+"\n"+"B :"+b);
 System.out.println("Multiplication :"+e);
 }
 else if(op=='/')
 {
 if(b!=0)
 {
 double f=a/b;
 System.out.println("A :"+a+"\n"+"B :"+b);
 System.out.println("Division :"+f);
 }
 else
 {
 System.out.println("Error !Any Number Cannot be Divisible by Zero");
 }
 }
 else
 {
 System.out.println("Invalid Operator,Enter the Operator Symbol Correctly!!!");
 }
 }
}