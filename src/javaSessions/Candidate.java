package javaSessions;

public class Candidate {
	
	String name;
	int age;
	String location;
	
	

	public Candidate(String name, int age, String location) {
		
		this.name = name; 
		this.age = age;
		this.location = location;
	}



	public static void main(String[] args) {
		
		Candidate a=new Candidate("Imran", 32, "Chennai");
		
		Candidate b=new Candidate("Ajmal", 07, "Kelambakkam");
		
		Candidate c=new Candidate("Jaseena", 02, "Padur");
		
		a=b;
		
		System.out.println(a.name+" "+a.age+" "+a.location);
		System.out.println(b.name+" "+b.age+" "+b.location);
		System.out.println(c.name+" "+c.age+" "+c.location);
		
		b=c;
		
		System.out.println(a.name+" "+a.age+" "+a.location);
		System.out.println(b.name+" "+b.age+" "+b.location);
		System.out.println(c.name+" "+c.age+" "+c.location);
	
	}
}
