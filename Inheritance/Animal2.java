package Inheritance;

public class Animal2 {
	//Downcasting.
	
	
		void eat()
		{
			System.out.println("Eats Grass");
		}
		void drink()
		{
			System.out.println("Drinking");
		}
		void run()
		{
			System.out.println("Running");
		}
		
		

		public static void main(String args[])
		{
			Animal2 b = new Cat2(); 
		    //it means every cat1 is animal1.
			// <----- Dynamic Method Binding./UpCasting
			b.eat();
			b.run();
			b.drink();
		    //b.jump();
		    
		    Cat2 C2 = (Cat2) b;
		    C2.jump();
		}
	}
		    class Cat2 extends Animal2
		    {
		    	
		     @Override
		     
		    //override should be above the method.
		    //override it is used to not display the parent prop or class.	
		    //if we want to dispaly the parent class so we want to use super 	
		     // in override method child class should not write any parameters.
		    //paremeters shoulld be same
		     
		     void eat()
		    	
		     {
		    	 super.eat();
		    //if we want to dispaly the parent class so we want to use super and remove @Override.
		    		
		    System.out.println("Drinks Milk");
		    	}


		     void jump()
		 	{
		 		System.out.println("Jumping");	
		 	}
	}

