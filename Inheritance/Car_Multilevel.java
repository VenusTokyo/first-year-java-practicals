package Inheritance;

public class Car_Multilevel {
	String Vehicle = "Cars";
	String Four_Wheler = "Honda";

	public static void main(String args[])
	{
		Honda h = new Honda();
		System.out.println(h.Vehicle);
		System.out.println(h.Four_Wheler);
		System.out.println(h.Car_Name);
		System.out.println(h.Car_Type);
		System.out.println(h.Model_no);
		System.out.println(h.Cost);
	}	
}

class Cars extends Car_Multilevel
{
	String Car_Name = "Honda";
	String Car_Type  = "Four_Wheler" ;
}

class Honda extends Cars
{
	String Model_no = "EC25";
	String Cost  = "80000";
}
