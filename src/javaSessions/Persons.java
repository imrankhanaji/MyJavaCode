package javaSessions;

public class Persons {
	
	String name;
	int age;
	char gender;
	long phonenumber;
	
	public Persons(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Persons(String name, int age,char gender, long phonenumber) {
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phonenumber=98767656;
		
	}
	
	public static void main(String[] args) {
		
		//Persons p1=new Persons(String name, int age, boolean gender, long phonenumber);
		
		Persons p1=new Persons("imran", 22, 'M', 32323232);
		
		System.out.println(p1.name+ " "+p1.age+" "+p1.gender+" "+p1.phonenumber);
		
		Persons p2=new Persons("ansari", 33);
		System.out.println(p2.name+" "+p2.age+" "+p2.gender+" "+p2.phonenumber);
		
	}
	
	
	

}
