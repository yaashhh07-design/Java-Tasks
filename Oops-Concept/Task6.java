import java.util.*;
class MagicMovie
{
	int year; 
	String title;
	float rating;
	
	MagicMovie()
	{
		year=0;
		title="";
		rating=0.0f;
	}
	
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter the Title of the Movie :");
		title=obj.nextLine();
		System.out.print("\nEnter the Year of the Movie Released :");
		year=obj.nextInt();
		System.out.print("\nEnter the Rating of the Movie [0.0 to 5.0] :");
		rating=obj.nextFloat();
		
		if(rating < 0.0f || rating > 5.0f)
		{
			System.out.println("Invalid Rating! Setting Rating to 0.0");
			rating = 0.0f;
		}
	}
	
	void display()
	{
		System.out.println("\nMovie :"+title);
		System.out.println("Year :"+year);
		if(rating >= 0.0f && rating <= 2.0f)
		{
			System.out.println("Review : Flop");
		}
		else if(rating > 2.0f && rating <= 3.4f)
		{
			System.out.println("Review : Semi-Hit");
		}
		else if(rating > 3.4f && rating <= 4.5f)
		{
			System.out.println("Review : Hit");
		}
		else
		{
			System.out.println("Review : Super-Hit");
		}
	}
}
class Task6
{
	public static void main(String args[])
	{
		MagicMovie m=new MagicMovie();
		m.accept();
		m.display();
	}
}