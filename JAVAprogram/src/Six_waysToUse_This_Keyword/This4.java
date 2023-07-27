package Six_waysToUse_This_Keyword;
//this keyword can be used to pass as an argument in the method call

public class This4 {
	 public void m1(This4 t)
	 {
		 System.out.println("Im in m1 Method");
	 }
	 public void m2()
	 {
		 m1(this);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This4 t=new This4();
		t.m2();
	}

}
