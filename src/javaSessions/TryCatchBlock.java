package javaSessions;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Imran");
		System.out.println("Imran");
		System.out.println("Imran");
		
		try{
			System.out.println("Inside try block");
			int i=9/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Khan");
		System.out.println("Khan");
		System.out.println("Khan");

	}

}
