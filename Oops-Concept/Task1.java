class car
{
	String carmake;
	String carmodel;
	int year;
}
class Task1
{
	public static void main(String args[])
	{
		car c1=new car();
		c1.carmake="Japan";
		c1.carmodel="Skoda";
		c1.year=1980;
		car c2=new car();
		c2.carmake="Tokyo";
		c2.carmodel="GTR-6";
		c2.year=1998;
		System.out.println("\nCar-1 :");
		System.out.println("Make :"+c1.carmake);
		System.out.println("Model :"+c1.carmodel);
		System.out.println("Year :"+c1.year);
		System.out.println("\nCar-2 :");
		System.out.println("Make :"+c2.carmake);
		System.out.println("Model :"+c2.carmodel);
		System.out.println("Year :"+c2.year);
	}
}