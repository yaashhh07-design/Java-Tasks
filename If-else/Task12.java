import java.util.Scanner;
class Task12
{
 public static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter the weight of the parcel in Grams :");
 int wg=obj.nextInt();
 System.out.println("For Ordinary booking enter '1' ");
 System.out.println("For Express booking enter '2' ");
 System.out.print("Enter the Booking Choice :");
 int choice=obj.nextInt();
 int crg=0;
 if(choice==1)
 {
 if(wg<=100)
 {
 crg=80;
 }
 else if(wg>=101 || wg<=500)
 {
 crg=150;
 }
 else if(wg>=501 || wg<=1000)
 {
 crg=210;
 }
 else
 {
 crg=250;
 }
 }
 else if(choice==2)
 {
 if(wg<=100)
 {
 crg=100;
 }
 else if(wg>=101 || wg<=500)
 {
 crg=200;
 }
 else if(wg>=501 || wg<=1000)
 {
 crg=250;
 }
 else
 {
 crg=300;
 }
 }
 else
 {
 System.out.println("Invalid Booking, Enter correctly !");
 }
 System.out.println("For the weight of the parcel "+wg+"gm The parcel charge is $"+crg);
 }
}