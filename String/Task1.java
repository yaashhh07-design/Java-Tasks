class Task1
{
	public static void main(String args[])
	{
		String str="success";
		char ch='s';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("\nNo of '"+ch+"' Present in the String-"+str+" :"+count);
	}
}