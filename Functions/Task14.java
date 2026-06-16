import java.util.Scanner;
class SmallLetter
{
	void toSmall(char a)
	{
		if(a>= 'A' && a<='Z')
		{
			a=(char)(a+32);
		}
		System.out.println("\nSmall Letter :"+a);
	}
}
class Task14
{
	public static void main(String args[])
	{
		SmallLetter obj1=new SmallLetter();
		Scanner obj2=new Scanner(System.in);
		System.out.print("\nEnter a Character in Capital Letter To Convert Small Letter :");
		char x=obj2.next().charAt(0);
		obj1.toSmall(x);
	}
}