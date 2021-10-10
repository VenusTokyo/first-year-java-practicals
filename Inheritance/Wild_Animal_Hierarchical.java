package Inheritance;

public class Wild_Animal_Hierarchical {
	String Jumangi = "Jumangi The Next Level";
	{
		System.out.println(Jumangi);
	}
	
	public static void main(String args[])
	{
		Monkey M = new Monkey();
		System.out.println("Monkey");
		Lion L = new Lion();
		System.out.println("Lion");
		Tiger T = new Tiger();
		System.out.println("Tiger");
	}
}


class Monkey extends Wild_Animal_Hierarchical
{
	String Name = "Monkey";
}

class Lion extends Wild_Animal_Hierarchical
{
	String Name = "Lion";	
}

class Tiger extends Wild_Animal_Hierarchical
{
	String Name = "Tiger";
}


