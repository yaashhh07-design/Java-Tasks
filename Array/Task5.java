import java.util.Scanner;
class Task5
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
		for(int i=0;i<n-1;i++)
		{
		 for(int j=i+1;j<n;j++)
		{
		 if(arr[i]>arr[j])
		 {
		  int temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
		 }
		}
		}
		System.out.println("Array Elements in Ascending Order :");
		for(int i=0;i<n;i++)
		{
		 System.out.println(arr[i]+" ");
		}
	}
}