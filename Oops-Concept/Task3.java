import java.util.*;
class Employee
{
	public String name;
	public int id;
	public double salary;
	public void set_info(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		if(salary>=0)
		{
			this.salary=salary;
		}
		else
		{
			System.out.println("Salary Cannot be Negative !!!");
		}
	}
	public String get_name()
	{
		return name;
	}
	public int get_id()
	{
		return id;
	}
	public double get_salary()
	{
		return salary;
	}
}
class Task3
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter the Employee Name :");
		String en=obj.nextLine();
		System.out.print("\nEnter the Employee ID :");
		int ei=obj.nextInt();
		System.out.print("\nEnter the Employee Salary :");
		double es=obj.nextDouble();
		e.set_info(en,ei,es);
		System.out.println("\nEmployee Name :"+e.get_name()+"\n"+"Employee ID :"+e.get_id()+"\n"+"Employee Salary :"+e.get_salary());
	}
}