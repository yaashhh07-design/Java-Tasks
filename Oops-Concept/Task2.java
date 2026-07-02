interface Animal
{
	void makeSound();
}
class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("Dog Says : Bow Bow!!!");
	}
} 
class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("Cat Says : Meow Meow!!!");
	}
}
class Cow implements Animal
{
	public void makeSound()
	{
		System.out.println("Cow Says : Maaah Maaah!!!");
	}
} 
class Task2
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		Cat c=new Cat();
		Cow cw=new Cow();
		
		d.makeSound();
		c.makeSound();
		cw.makeSound();
	}
}