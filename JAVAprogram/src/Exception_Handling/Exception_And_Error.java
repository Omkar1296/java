package Exception_Handling;

//Exception--Unwanted and unexpected event occurs during the execution of program i.e. at Runtime ,which distrub normal flow of program. It occur due to programmer 
//Exception Handling--Alternate Way

//Note-----Object class is the parent class of all classes in java.-------For execption throwable is parent class

//Error-----It occur due to lack of system resources and it is not occur due to programmer
//Exception have two types 1.Checked Exception(Complie time exception)  2.Unchecked Exception (Runtime exception)
//Complie time exception are --NoSuchElementFound,ClassNotFound,(InputOutputException--FileNotFound,EndOfFile,IOException),Interrupted,Remote
//Runtime Exception---Arithimatic,ClassCast,NullPointer,(OutOfBoxException--ArrayOutOfBox,StringOutOfBox),RuntimeError
//try{ //Risky code } catch(Exception e) { //Handling code }
public class Exception_And_Error {

	public static void main(String[] args) {
		try
		{int i=10,j=0,c;
		c=i/j;
		System.out.println(c);
		}
		
		catch(Exception e)
		{
			//System.out.println("Do not divide by zero");
			System.out.println(e);
		}
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		

	}

}
