package javaSessions;

public class MethodTypes {
	
	//1. Simple methods
	
	public void test() {
		System.out.println("test method");
	}

	//2. no input some return
	
	public String getStudentName() {
		
		System.out.println("student method");
		String name="Imran";
		return name;
	}
	
	//3.input and return both
	
	public int add(int a, int b) {
		System.out.println("Add method");
		int total= a+b;
		return total;
		
	}
	
	public static void main (String[] args){
		
		MethodTypes type=new MethodTypes();
		type.test();
		String name=type.getStudentName();
		int sum=type.add(700, 2650);
		
		System.out.println(name);
		System.out.println(sum);
		
	}
	
}
