package Exception_Handling;

//Finally block handle cleanup code
//whenever their is exception occur or not finally block get executed
//finally{ //clean up code}
//we can use multiple catch block with single try block----but we can use single finally block with one try block,not multiple
//finally block will executed with try block-----if their is not try block and only finally block is present it will not executed
public class Finally {

	public static void main(String[] args) {
		/*try
		{
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Hello");
		}
		*/
		
		try
		{
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		finally
		{
			System.out.println("Hello");
		}
		
		
		/*finally
		{
			System.out.println("Hello");  //Not executed
		}*/

	}

}
