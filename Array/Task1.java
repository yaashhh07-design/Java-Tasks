import java.util.Scanner;
class Task1
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int arr[]=new int[20];
		int largest,smallest,sum=0;
		System.out.print("Enter the elements of the Array :");
		for(int i=0;i<20;i++)
		{
			arr[i]=obj.nextInt();
		}
		largest=arr[0];
		smallest=arr[0];
		for(int i=0;i<20;i++)
		{
			if(arr[i]>largest)
			{
			 largest=arr[i];
			}
			if(arr[i]<smallest)
			{
			 smallest=arr[i];
			}
			sum+=arr[i];
		}
		System.out.println("\nLargest Number :"+largest);
		System.out.println("Smallest Number :"+smallest);
		System.out.println("Sum of All Numbers :"+sum);
	}
}