package Inheritance;

import java.util.Scanner;

public class Organisation {
	int id;
	String name;
	
	void T_Organisation(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
		
	void display()
	{
		System.out.println(id);
		
		System.out.println(name);
	}
	
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id =");
		int id=Sc.nextInt();
		
		System.out.println("Enter Your Name =");
		String name=Sc.next();
		
		System.out.println("Enter Your Address =");
        String Address=Sc.next();
        
		T_Organisation T = new T_Organisation(id, name, Address);
		T.display();
		
		System.out.println(T.Address);
	}
}

class T_Organisation extends Organisation
{
	
	String Address;
	
	public T_Organisation(int id , String name , String Address)
	{
		super();
		
		super.id = id;
		super.name = name;
		
		this.Address = Address;
	}
}
