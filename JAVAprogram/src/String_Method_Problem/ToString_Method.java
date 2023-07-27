package String_Method_Problem;

class Student
{
	String name;
	int rollno;
	String city;
	
	Student(String name,int rollno,String city)
	{
		this.name=name;
		this.rollno=rollno;
		this.city=city;
	}
	
	public String toString()
	{
		return (name+" "+rollno+" "+city);
	}
}

public class ToString_Method {

	public static void main(String[] args) {
		
		Student s=new Student("rakesh",112,"jaypur");
		System.out.println(s);
		
		

	}

}
