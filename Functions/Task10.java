import java.util.Scanner;
class NumberFunction
{
	void Square(int a)
	{
		System.out.println("\nSquare :"+(a*a));
	}
	void Cube(int b)
	{
		System.out.println("Cube :"+(b*b*b));
	}
}
class Task10
{
	public static void main(String args[])
	{
		NumberFunction obj1=new NumberFunction();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter The Value for Square :");
		int x=obj2.nextInt();
		System.out.print("Enter The Value for Cube :");
		int y=obj2.nextInt();
		obj1.Square(x);
		obj1.Cube(y);
	}
}