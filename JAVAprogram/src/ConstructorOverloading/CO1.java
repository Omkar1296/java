package ConstructorOverloading;

public class CO1 {

	public static void main(String[] args) {
		Car c=new Car("TATA");
		c.cdetails();

		c=new Car("TATA","Punch","Black");
		c.cdetails();
		
		c=new Car("TATA","Punch","Black",5,700000);
		c.cdetails();
	}

}
