package Data_Hiding_Encapsulation;

public class Account {
	private String name;
	private long accountNo;
	private double bal;
	private int pin;
	
	//setters
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	
	public void setBal(double bal)
	{
		this.bal=bal;
	}
	
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public long getAccountNo()
	{
		return accountNo;
	}
	
	public double getBal()
	{
		return bal;
	}
	
	public int getPin()
	{
		return pin;
	}
	
	public void deposite(double amt)
	{
		bal=bal+amt;
	}
	
	public void wihhdraw(double amt,int pin)
	{
		if(amt<=bal)
		{
			if(this.pin==pin)
			{
				bal=bal-amt;
				System.out.println("Please collect the Amount");
			}
			else
			{
				System.out.println("hawle check the Pin");
			}
		}
		else
		{
			System.out.println("hey r u mad no balance");
		}
	}
	public void details()
	{
		System.out.println("Accouont holder name is: "+name);
		System.out.println("Accouont holder Number is: "+accountNo);
		System.out.println("Accouont holder Balance is: "+bal);
	}
	

}
