package Relationship_Has_A_and_IS_A;

class Vehicle
{
	int Nplate=4455;
	public void vStart()
	{
		System.out.println("Vehicle start.....");
	}
}

class Bus extends Vehicle
{
	int notyre=6;
	int nogear=5;
	public void bStart()
	{
		System.out.println("Bus start.....");
	}
}
 class Bike extends Vehicle
 {
	 int bknotyre=2;
	 int bknogear=4;
	 public void Start()
		{
			System.out.println("Bike start.....");
		}
 }
 
 class Truck extends Vehicle
 {
	 int tnotyre=8;
	 int tnogear=6;
	 public void TStart()
		{
			System.out.println("Truck start.....");
		}
 }

public class Herarchical_Inheritance {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		System.out.println(v.Nplate);
		v.vStart();
		
		Bus b=new Bus();
		System.out.println(b.nogear);
		System.out.println(b.notyre);
		System.out.println(b.Nplate);
		b.bStart();
		b.vStart();
		
		Bike bk=new Bike();
		System.out.println(bk.bknogear);
		System.out.println(bk.bknotyre);
		bk.Start();
		System.out.println(b.notyre);
		
		Truck t=new Truck();
		System.out.println(t.tnotyre);
		System.out.println(t.tnogear);
		System.out.println(bk.bknotyre);
		t.TStart();
	}

}

