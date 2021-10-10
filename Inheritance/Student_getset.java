package Inheritance;

import java.util.Scanner;

public class Student_getset {

	private int id;
	private String name;
	private float marks;
	
	//getters and setters
	
	public int getId()
	{
	return id;	
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
	return name;	
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getMarks()
	{
	return marks;	
	}
	
	public void setMks(float marks)
	{
		this.marks=marks;
	}
	
	
	
	public static void main(String args[])
	{
		
		Student_getset S = new Student_getset();
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your Id = ");
	  int id = sc.nextInt();
	  S.setId(id);
	 
	  
	  System.out.println("Enter your Name = ");
	  String name = sc.next();
	  S.setName(name);
	  
	  System.out.println("Enter your Marks = ");
	  float marks = sc.nextFloat();
	  S.setMks(marks);
	
	
	id = S.getId();
	System.out.println("Id = " + id);
	
	name = S.getName();
	System.out.println("Name = " + name);
	
	marks = S.getMarks();
	System.out.println("Marks = " + marks);
	
	
	}
}
