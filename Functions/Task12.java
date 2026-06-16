import java.util.Scanner;
class CharCheck
{
	void isCapital(char a)
	{
		if(a>= 'A' && a<='Z')
		{
			System.out.println(a+" is a Capital Letter");
		}
		else
		{
			System.out.println(a+" is not a Capital Letter");
		}
	}
}
class Task12
{
	public static void main(String args[])
	{
		CharCheck obj1=new CharCheck();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter a Character :");
		char x=obj2.next().charAt(0);
		obj1.isCapital(x);
	}
}