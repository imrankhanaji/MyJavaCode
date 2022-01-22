package javaSessions;

public class Car {
	
	String company;
	String model;
	String color;
	static int wheels=4;

	public static void main(String[] args) {
		
		
		Car obj=new Car();
		obj.company="AUDI";
		obj.model="CUV";
		obj.color="Black";
		Car.wheels=4;
		
		Car obj1=new Car();
		obj1.company="Honda";
		obj1.model="xxx";
		obj1.color="White";

		System.out.println(obj.company + " "+ obj.model +" "+obj.color+ " "+Car.wheels);
		}
		
			
}
		
		
			
		
		
				
		


