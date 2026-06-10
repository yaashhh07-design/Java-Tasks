import java.util.Scanner;
class Task13
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 double price,total,discount=0;
 System.out.print("Enter the price of the laptop :");
 price=obj.nextDouble();
 if(price==50000)
 {
 discount=price*0;
 }
 else if(price>=50001 || price<=100000)
 {
 discount=price*0.10;
 }
 else if(price>=100001 || price<=150000)
 {
 discount=price*0.15;
 }
 else
 {
 discount=price*0.20;
 }
 total=price-discount;
 System.out.println("\nThe priceof the Laptop :"+price);
 System.out.println("Discount :"+discount);
 System.out.println("Total price :"+total);
 }
}