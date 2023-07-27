package Exception_Handling;

import java.io.FileInputStream;

public class Exception2 {

	public static void main(String[] args)
	{
		
		//FileInputStream fis=new FileInputStream("d:/abc.txt");  //Checked Exception--Checked Exception
		
		String s=null;                              //Nullpointer exception  ---unchecked exception (RunTime Exception)
		System.out.println(s.length());

	}

}
