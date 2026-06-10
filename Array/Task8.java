import java.util.Scanner;
class Task8
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int arr[]=new int[10];
		int onedigitnum=0,twodigitnum=0;
		System.out.print("Enter the Elements of the Array :");
		for(int i=0;i<arr.length;i++)
		{
		 arr[i]=obj.nextInt();
		 if(arr[i]>=0 && arr[i]<=9)
		 {
			onedigitnum+=arr[i];
		 }
		 else if(arr[i]>=10 && arr[i]<=99)
		 {
			twodigitnum+=arr[i];
		 }
		}

		System.out.println("\nSum of the One Digit Number :"+onedigitnum);
		System.out.println("Sum of the Two Digit Number :"+twodigitnum);
	}
}