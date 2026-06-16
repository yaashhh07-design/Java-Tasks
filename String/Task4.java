import java.util.Scanner;
class StringTask
{
	void ReverseString(String s)
	{
		System.out.println("Reverse String :");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		int count=0;
		System.out.print("\nThe Vowels Are :");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.print(ch+" ");
				count++;
			}
		}
		System.out.println("\nNo of Vowels Present in the String-"+s+" is :"+count);
	}
}
class Task4
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter a String to Reverse it and Find its Vowels :");
		String str=obj.next();
		System.out.println("The String :"+str);
		StringTask st=new StringTask();
		st.ReverseString(str);
	}
}