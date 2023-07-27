package Relationship_Has_A_and_IS_A;

public class PG {
	private String pgname;
	private String pgaddress;
	private long pgcno;
	private double rent;
	
	Student s;
	PG()
	{
		
	}
	PG(String pgname,String pgaddress,long pgcno,double rent)
	{
		this.pgname=pgname;
		this.pgaddress=pgaddress;
		this.pgcno=pgcno;
		this.rent=rent;
	}
	//Setter
	public void setPgname(String pgname)
	{
		this.pgname=pgname;
	}
	public void setPgaddress(String pgaddress)
	{
		this.pgaddress=pgaddress;
	}
	public void setPgcno(long pgcno)
	{
		this.pgcno=pgcno;
	}
	public void setRent(Double rent)
	{
		this.rent=rent;
	}
	//getter
	public String getPgname()
	{
		return pgname;
	}
	public String getPgaddress()
	{
		return pgaddress;
	}
	public long getPgcno()
	{
		return pgcno;
	}
	public double getRent()
	{
		return rent;
	}
	public void addmission(String sname, String saddress, long scno, long pcno)
	{
		s=new Student(sname,saddress,scno,pcno);
		System.out.println();
		System.out.println("Student name "+ sname +" joined PG successfully");
	}
	public void pgdetails()
	{
		System.out.println("PG details are..");
		System.out.println("=================");
		System.out.println("PG name is "+ pgname);
		System.out.println("PG address is "+ pgaddress);
		System.out.println("PG contact number is "+ pgcno);
		System.out.println("PG rent is "+ rent);
	}
	
}
