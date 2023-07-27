package Relationship_Has_A_and_IS_A;

public class Car {
	private String model;
	private String company;
	private String colur;
	private double price;
	Engine e;
	
	Car()
	{
		
	}
	Car(String model, String company, String colur, double price,String etype,String stroke,double eprice)
	{
		e=new Engine(etype,stroke,eprice);
		this.model=model;
		this.company=company;
		this.colur=colur;
		this.price=price;
	}
	//Setter
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public void setColur(String colur)
	{
		this.colur=colur;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	//getters
	public String getModel()
	{
		return model;
	}
	public String getCompany()
	{
		return company;
	}
	public String getColur()
	{
		return colur;
	}
	public double getPrice()
	{
		return price;
	}
	public void details()
	{
		e.edetails();
		System.out.println();
		System.out.println("Car details aree....");
		System.out.println("Car model is: "+getModel());
		System.out.println("Car company is: "+getCompany());
		System.out.println("Car colur is: "+getColur());
		System.out.println("Car price is: "+getPrice());
		
		
	}
	
	 

}
