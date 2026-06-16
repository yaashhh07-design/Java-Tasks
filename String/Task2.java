class Task2
{
	public static void main(String args[])
	{
		String str="Computer";
		int count=0;
		System.out.print("\nThe Vowels Are :");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.print(ch+" ");
				count++;
			}
		}
		System.out.println("\nNo of Vowels Present in the String-"+str+" is :"+count);
	}
}