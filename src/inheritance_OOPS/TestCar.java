package inheritance_OOPS;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b1=new BMW();
		b1.Start();
		b1.Stop();
		b1.Refuel();
		
		
		System.out.println("--------------");
		
		//top casting: Child class can be referred by parent class variable
		
		Car c1=new BMW();
		c1.Start();
		System.out.println("--------------");
		
		Audi a1=new Audi();
		a1.Start();
		a1.engine();

	}

}
