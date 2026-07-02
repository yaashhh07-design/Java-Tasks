import java.util.Scanner;
abstract class BankAccount
{
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
} 
class SavingsAccount extends BankAccount
{
	double balance=5000;
	void deposit(double amount)
	{
		System.out.println("\nBalance :"+balance);
		balance+=amount;
		System.out.println("\nCredited Amount :"+amount);
		System.out.println("Current Balance :"+balance);
	}
	void withdraw(double amount)
	{
		if(balance>=amount)
		{
			System.out.println("\nBalance :"+balance);
			balance-=amount;
			System.out.println("\nDebited Amount :"+amount);
			System.out.println("Current Balance :"+balance);
		}
		else
		{
			System.out.println("\nInsufficent Balance");
		}
	}
}
class CheckingAccount extends BankAccount
{
	double balance=10000;
	void deposit(double amount)
	{
		System.out.println("\nBalance :"+balance);
		balance+=amount;
		System.out.println("\nCredited Amount :"+amount);
		System.out.println("Current Balance :"+balance);
	}
	void withdraw(double amount)
	{
		if(balance>=amount)
		{
			System.out.println("\nBalance :"+balance);
			balance-=amount;
			System.out.println("\nDebited Amount :"+amount);
			System.out.println("Current Balance :"+balance);
		}
		else
		{
			System.out.println("\nInsufficent Balance");
		}
	}
}
class Task4
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		SavingsAccount sa=new SavingsAccount();
		System.out.print("\nEnter the Amount to Deposit in SavingsAccount :");
		double dep1=obj.nextDouble();
		sa.deposit(dep1);
		System.out.print("\nEnter the Amount to WithDraw in SavingsAccount :");
		double wit1=obj.nextDouble();
		sa.withdraw(wit1);
		System.out.println();
		CheckingAccount ca=new CheckingAccount();
		System.out.print("\nEnter the Amount to Deposit in CheckingAccount :");
		double dep2=obj.nextDouble();
		ca.deposit(dep2);
		System.out.print("\nEnter the Amount to WithDraw in CheckingAccount :");
		double wit2=obj.nextDouble();
		ca.withdraw(wit2);
	}
}