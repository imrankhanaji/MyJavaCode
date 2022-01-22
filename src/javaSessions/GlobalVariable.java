package javaSessions;

public class GlobalVariable {
	
	int k=100;  //Assigned the value
	String name;
	double salary;

	public static void main(String[] args) {
		
		int i;
		i=20;
		System.out.println(i);
		
		GlobalVariable var=new GlobalVariable();
		
		System.out.println(var.k);
		System.out.println(var.name);
		System.out.println(var.salary);
	}

}
