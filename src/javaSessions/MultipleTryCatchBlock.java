package javaSessions;

public class MultipleTryCatchBlock {

	public String name="Imran Khan";
	
	public static void main(String[] args) {
		
		System.out.println("My Java code");
		System.out.println("My selenium code");
		
		
		try {
			int i=9/0;
		MultipleTryCatchBlock obj=null;
		System.out.println(obj.name);
		
		}
		catch (NullPointerException e) {
			
		}
		
		
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Bye");
			
		}
	
	
	
	
		
}
