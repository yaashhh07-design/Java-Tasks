import java.util.Scanner;
class LaptopDiscount
{
	void CalculateCharges(double a)
	{
		double discount=0,totalprice;
		if(a<=50000)
		{
			discount=0;
		}
		else if(a>=50001 || a<=100000)
		{
			discount=a*10/100;
		}
		else if(a>=100001 || a<=150000)
		{
			discount=a*15/100;
		}
		else
		{
			discount=a*20/100;
		}
		totalprice=a-discount;
		System.out.println("\nThe Price Of the laptop :"+a);
		System.out.println("Discount Of the laptop :"+discount);
		System.out.println("TotalPrice Of the laptop :"+totalprice);
	}
}
class Task9
{
	public static void main(String args[])
	{
		LaptopDiscount obj1=new LaptopDiscount();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter the Price Of the laptop :");
		int x=obj2.nextInt();
		obj1.CalculateCharges(x);
	}
}