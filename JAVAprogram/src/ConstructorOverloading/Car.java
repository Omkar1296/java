package ConstructorOverloading;

public class Car {
	private String brand;
	private String model;
	private String colur;
	private int gear;
	private double price;
	
	Car()
	{
		
	}
	
	Car(String brand)
	{
		this.brand=brand;
	}
	
	Car(String brand,String model,String colur)
	{
		this(brand);
		this.model=model;
		this.colur=colur;
	}
	
	Car(String brand,String model,String colur,int gear,double price)
	{
		this(brand,model,colur);
		this.gear=gear;
		this.price=price;
	}
	public void cdetails()
	{
		System.out.println("Car details are..");
		System.out.println("===================");
		System.out.println("Car brand is: "+brand);
		System.out.println("Car model is: "+model);
		System.out.println("Car colur is: "+colur);
		System.out.println("Car gear is: "+gear);
		System.out.println("Car price is: "+price);
	}
}
