package Abstract_Method_And_Interface_Method;
//Abstract method means hide details(no implementation)
//Abstract method achived by two ways 1.Abstarct class(0-100%) 2.interface(100% abstraction)
//if we make as abstract method then make class as abstact
//In abstract class it consist of both abstract method and concreate method
//if any abstarct class inheritance then first implement tht method
//we can not do static member as abstarct

//Hirichical Inheritance
abstract class Vehicle   //parent class
{
	int gear ;
	abstract public void start();  //we acheive 100 % abstraction
	public void stop()
	{
		System.out.println("Stop the vhicle");  //Concreate Class
	}
	
}

class Car extends Vehicle
{
	int gear=5;
	public void start()
	{
		System.out.println("Car start with keys");
	}
}

class Scooter extends Vehicle
{
	public void start()
	{
		System.out.println("Scooter start with keys");
	}
}
public class Abstarct1 {

	public static void main(String[] args) {
		//Vehicle v=new Vehicle();
		
		Scooter s=new Scooter();
		s.start();
		
		Vehicle v=new Scooter();   //upcasting
		v.start();
		System.out.println(v.gear);
	}

}
