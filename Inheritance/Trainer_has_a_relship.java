package Inheritance;

public class Trainer_has_a_relship {

	//Has a relatioship
	    //tighly  coupled.
	//loosly coupled.
	
	
	 int id;
	 String name;
	Address add;
	
	
	
	Trainer_has_a_relship (int id , String name , Address add) 
  {
	this.id=id;
	this.name=name;
	this.add=add;
  }
	
	public String toString()
	{
		return "Id="+id + "\nName="+name + "\nAddress="+add;
	}
	
	public static void main(String args[])
	{
		
		Address A = new Address("15446","Thane","Maharashtra");
		
		Trainer_has_a_relship T = new Trainer_has_a_relship(101,"Chetan",A);
		System.out.println(T);

	}
		
}

class Address 
{
	String pincode;
	String city;
	String state;
	
	Address(String pincode , String city , String state)
	{
		this.pincode=pincode;
		this.city=city;
		this.state=state;
	}
	
	public String toString()
	{
		return "\nPincode="+pincode + "\nCity="+city + "\nState="+state;
	}

}
