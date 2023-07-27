package Six_waysToUse_This_Keyword;
//this keyword can be ued to invoke current class method(implicity)

class This
{
	public void display()
	{
		System.out.println("hello");
	}
	public void show()
	{
		display();
		this.display();
	}
}
public class This2 {
	public static void main(String[]args)
	{
		This t=new This();
		t.show();
	}

}
