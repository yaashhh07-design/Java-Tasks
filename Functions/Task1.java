class Sequence
{
	void series1()
	{
		for(int i=2;i<=16;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	void series2()
	{
		for(int i=50;i>=0;i-=10)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class Task1
{
	public static void main(String args[])
	{
		Sequence obj=new Sequence();
		System.out.println("\nSeries-1 :");
		obj.series1();
		System.out.println("Series-2 :");
		obj.series2();
	}
}