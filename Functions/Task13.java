import java.util.Scanner;
class CharCheck
{
	void isCapital(char a)
	{
		if(a>='a' || a<='e' || a<='i' || a<='o' || a<='u' || a>='A' || a<='E' || a<='I' || a<='O' || a<='U')
		{
			System.out.println(a+" is a Vowel");
		}
		else
		{
			System.out.println(a+" is a Constant");
		}
	}
}
class Task13
{
	public static void main(String args[])
	{
		CharCheck obj1=new CharCheck();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter a Character to Find Vowel or Constant :");
		char x=obj2.next().charAt(0);
		obj1.isCapital(x);
	}
}