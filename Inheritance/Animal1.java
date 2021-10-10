package Inheritance;

public class Animal1 {
	//overriding method.
		//&
		//UpCasting
		
		void eat()
		{
			System.out.println("Eats Grass");
		}
		
		void run()
		{
			System.out.println("Running");
		}
		
		void jump()
		{
			System.out.println("Jumping");	
		}

		public static void main(String args[])
		{
			//Two Methods
			//1.
			Cat1 C = new Cat1();
		    C.run();
		    C.jump();
		    C.eat();
			
		    //2.
			//UpCasting.
			//Animal1 b = new Cat1(); 
		    //it means every cat1 is animal1.
			// <----- Dynamic Method Binding./UpCasting
			//b.eat();
			//b.run();
		    //b.jump();
	}
	}

	class Cat1 extends Animal1
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



	}
	//child cannot inherit prop of parent. 
	//5 rules for overriding
	// 1 = method name should be same.
	// 2 = paremeters shoulld be same , child class cannot change the parameters.
	// 3 = Returntype shoulld be same.
	// 4 = Scope should not be restricted. & highest scope is public if we write public in parent class & prive/ptotected/<default> in child class it will cause error
	  //public in parent & public in Child...
	// 5 = Exception Handling = .


