class Task3
{
	public static void main(String args[])
	{
		String str="India is my country";
		str=str.toUpperCase();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}
}