package Six_waysToUse_This_Keyword;
//this keyword can be uesd to refer currnet class instance variable
class Demo
{
	int i;  //instance variable
	public void setValue( int i)  //local variable(int a)
	{
		//i=a;   //50
		//i=i;     //print 0 value bcoz local variable value is 0
		this.i=i;
	}
	public void show()
	{
		System.out.println(i);
	}
	
}
public class This1 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.setValue(50);
		d.show();
	}

}
