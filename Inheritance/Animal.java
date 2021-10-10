package Inheritance;

public class Animal {

	int legs;
	String breed;
	
 Animal()
{
System.out.println("In Parent Class");
   }

Animal(int legs,String breed)
{
	this.legs=legs;
	this.breed=breed;
}

public static void main(String args[])
 
{
Cat C = new Cat(4,"White","Indian");	
System.out.println(C.legs);
System.out.println(C.color);
System.out.println(C.breed);
}

}
	class Cat extends Animal
	{
		String color;
		Cat(int legs,String color,String breed)
		
		{
			//super (legs,breed);
			
		System.out.println("In Child Class");
		this.color=color;
	}
		
}
