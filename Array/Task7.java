import java.util.Scanner;
class Task7
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
		System.out.println("\nDuplicate Elements :");
		for(int i=0;i<n-1;i++)
		{
		 for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]+" ");
				}
			}	
		}
	}
}