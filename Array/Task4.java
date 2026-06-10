import java.util.Scanner;
class Task4
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the size of the Array :");
		int n=obj.nextInt();
		int maximum,minimum;
		int arr[]=new int[n];
		System.out.print("Enter the Elements of the Array :");
		for(int i=0;i<n;i++)
		{
		 arr[i]=obj.nextInt();
		}
		maximum=arr[0];
		minimum=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>maximum)
			{
			 maximum=arr[i];
			}
			if(arr[i]<minimum)
			{
			 minimum=arr[i];
			}
		}
		System.out.println("\nmaximum Number :"+maximum);
		System.out.println("minimum Number :"+minimum);
	}
}