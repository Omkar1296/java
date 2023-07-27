package Exception_Handling;

public class ExceptionMethod {

	public static void main(String[] args) {
		try
		{
		int i=10,j=0,c;
		c=i/j;
		System.out.println(c);
		}
		catch(Exception e)
		{
			//System.out.println(e);
			//e.printStackTrace(); //print exception name,description,stacktrace
			//System.out.println(e); 
			//System.out.println(e.toString());  //print exception name,description
			System.out.println(e.getMessage());  //print only description
		}

	}

}
