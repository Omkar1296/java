package Six_waysToUse_This_Keyword;
//this keyword can be uesd to return the current class instance from the method

public class This6 {
	public This6 m1()
	{
		return this;
	}

	public static void main(String[] args) {
		This6 t=new This6();
		t.m1();

	}

}
