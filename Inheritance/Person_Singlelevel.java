package Inheritance;

public class Person_Singlelevel {
	int id = 100;
	String name = "Vivek";

			public static void main(String args[])
			{
				Student S = new Student();
				System.out.println(S.id);
				System.out.println(S.name);
				S.address();
				S.Marks();
			}
	}
class Student extends Person_Singlelevel
{
	String Address = "Kalyan";
	String Marks = "50";
	
	void address() 
	{
		System.out.println(Address);
	}
	
	void Marks() 
	{
		System.out.println(Marks);
	}
}
