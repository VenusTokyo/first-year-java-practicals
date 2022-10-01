package p1;

public abstract class Shape 
{
	//this creats a circle in the program
	public String id;
    public Shape (String id)
    {this.id = id;}

    
    public abstract double getArea();

    public String getId()
    {return id;}
    
    public String toString( )
    {return "Shape[id="+id+",area="+getArea()+"]";}

    
  }
