import java.util.Scanner;
class Task5
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter a String to Find its Longest Word And Characters :");
		String str=obj.nextLine();
		System.out.print("\nThe String :"+str);
		String words[]=str.split(" ");
		String longest=words[0];
		for(int i=1;i<words.length;i++)
		{
			if(words[i].length()>longest.length())
			{
				longest=words[i];
			}
		}
		System.out.println("\nLongest word :"+longest);
		System.out.println("No of Characters :"+longest.length());
	}
}