package javaSessions;

public class FunctionsInJava {
	
	
	
	//Define class variables
	String name;
	String country;
	double phoneno;
	String mail;
	boolean iscitizen;
	
	public void test() {
		System.out.println("test method..");
	}
	
	//public static void main(String[] args) {
	
	public static void main(String[] args) {
		
		FunctionsInJava user=new FunctionsInJava();
		
		String s1=user.name="imran";
		String s2=user.country="india";
		double s3=user.phoneno=787878;
		String s4=user.mail="imran@gmail.com";
		boolean s5=user.iscitizen=true;
		
		System.out.println(s1 +" "+s2+" "+s3+" "+s4+" "+s5);
		user.test();
		
	}
	
	

}
