package Relationship_Has_A_and_IS_A;

public class Engine {
	private String etype;
	private String stroke;
	private double eprice;
	
	Engine()
	{
		
	}
	Engine(String etype,String stroke,double eprice)
	{
		this.etype=etype;
		this.stroke=stroke;
		this.eprice=eprice;
	}
	//setter
	public void setEtype(String etype)
	{
		this.etype=etype;
	}
	public void setStroke(String stroke)
	{
		this.stroke=stroke;
	}
	public void setEprice(double eprice)
	{
		this.eprice=eprice;
	}
	//getters
	public String getEtype()
	{
		return etype;
	}
	public String getStroke()
	{
		return stroke;
	}
	public double getEprice()
	{
		return eprice;
	}
	public void edetails()
	{
		System.out.println("Engine details are..");
		System.out.println("Engine type is: "+getEtype());
		System.out.println("Engine stroke is: "+getStroke());
		System.out.println("Engine price is: "+getEprice());
	}
}
