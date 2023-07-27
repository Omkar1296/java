package Exception_Handling;
//throws keyword is used to declare the exception

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		//statement
	}
	
	void saveFile() throws FileNotFoundException
	{
		String text="text is demo";
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
		//statement
	}
}
public class Throws_Keyword {

	public static void main(String[] args) {
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
			rw=readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		rw.saveFile();
	}

}
