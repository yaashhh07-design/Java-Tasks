import java.util.*;
class Eshop
{
	String name;
	double price,discount,netAmount;
	
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter the name of the iteam :");
		name=obj.nextLine();
		System.out.print("\nEnter the price of the iteam :");
		price=obj.nextDouble();
	}
	
	void calculate()
	{
		if (price >= 1000 && price <= 25000)
		{
			discount = price * 5 / 100;
		}
		else if (price >= 25001 && price <= 57000)
		{
			discount = price * 7.5 / 100;
		}
		else if (price >= 57001 && price <= 100000)
		{
			discount = price * 10 / 100;
		}
		else if (price > 100000)
		{
			discount = price * 15 / 100;
		}
		else
		{
			discount = 0;
		}
		netAmount=price-discount;
	}
	
	void display()
	{
		System.out.println("\nName of the Iteam :"+name);
		System.out.println("Price :"+price);
		System.out.println("Discount :"+discount);
		System.out.println("NetAmount :"+netAmount);
	}
}
class Task7
{
	public static void main(String args[])
	{
		Eshop e=new Eshop();
		e.accept();
		e.calculate();
		e.display();
	}
}