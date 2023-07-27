package Relationship_Has_A_and_IS_A;

public class Student {
	private String sname;
	private String saddress;
	private long scno;  //student contact number
	private long pcno;  //parents contact number
	
	Student()
	{
		
	}
	Student(String sname,String saddress,long scno,long pcno)
	{
		this.sname=sname;
		this.saddress=saddress;
		this.scno=scno;
		this.pcno=pcno;
	}
	//setter
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setSaddress(String saddress)
	{
		this.saddress=saddress;
	}
	public void setScno(long scno)
	{
		this.scno=scno;
	}
	public void setPcno(long pcno)
	{
		this.pcno=pcno;
	}
	//getters
	public String getSname()
	{
		return sname;
	}
	public String getSaddress()
	{
		return saddress;
	}
	public long getScno()
	{
		return scno;
	}
	public long getPcno()
	{
		return pcno;
	}
	public void sdetails()
	{
		System.out.println("Student details are..");
		System.out.println("======================");
		System.out.println("Student name is: "+sname);
		System.out.println("Student Address is: "+saddress);
		System.out.println("Student Contact Number is: "+scno);
		System.out.println("Student Parent Contact Number is: "+pcno);
	}
	

}
