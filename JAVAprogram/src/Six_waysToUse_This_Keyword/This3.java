package Six_waysToUse_This_Keyword;
//this() can be uesd to invoke current class constructor

class This3
{
	 This3()
	{
		 this(100);
		System.out.println("No Args Constructor");
	}
	This3(int a)
	{
		//this();
		System.out.println("Paramitised Constructor");
	}
	public static void main(String[] args)
	{
		
		This3 d=new This3();
	}
}


