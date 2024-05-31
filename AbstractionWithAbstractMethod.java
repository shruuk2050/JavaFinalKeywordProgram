package abs;


abstract class Vehicle {
	  abstract void start();
	  
}
 class Car extends  Vehicle{

	@Override
	void start() {
		 System.out.println(" car start with self");
	}
	   
 }
  class Bike extends Vehicle{

		@Override
		void start() {
			 System.out.println(" Bike Start with kick");
		}
  	
  }


public class AbstractionWithAbstractMethod 
{

	public static void main(String[] args) 
	{
		 Car c=new Car();
		 c.start();
		 Bike b=new Bike();
		 b.start();
	}

}

