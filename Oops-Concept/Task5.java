import java.util.Scanner;
class OverloadCheck
{
	void check(String str1,char ch)
	{
		int count=0;
		System.out.println(\nString-1 :+str1);
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("No of '"+ch+"' Present in the String-"+str1+" :"+count);
	}
	void check(String str2)
	{
		str2=str2.toLowerCase();
		System.out.println(\nString-2 :+str2);
		System.out.print("The Vowels Are :");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.print(ch+" ");
			}
		}
	}
}
class Task5
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter the String-1 :");
		String str3=obj.next();
		System.out.print("\nEnter the Char :");
		char ch1=obj.next().charAt(0);
		System.out.print("\nEnter the String-2 :");
		String str4=obj.next();
		OverloadCheck oc=new OverloadCheck();
		oc.check(str3,ch1);
		oc.check(str4);
	}
}