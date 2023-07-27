package Relationship_Has_A_and_IS_A;
//relationship ---- If one object is dependent on another object is called as relationship
//their are two types ----1. HAS_A and 2.IS_A
//Has_A relationShip have two types 1.Composition----if one object is completely dependent on another object  Ex.for car engine is compeletely necessary
//2.Aggregation-------if one object is partially dependent on another object  Ex.

public class Has_A_Composition {
	public static void main(String[]args)
	{
		System.out.println("CAR Details are...");
		Car c=new Car("i20","Hundai","balck",700000,"Petrol","4 stroke",100000);
		c.details();
		c.e.edetails();
		c.setPrice(500000);
		System.out.println();
		System.out.println("Car price is: "+c.getPrice());
		System.out.println();
		System.out.println("Engine price is: "+c.e.getEprice());
	}

}
