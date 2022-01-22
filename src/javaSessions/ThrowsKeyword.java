package javaSessions;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		System.out.println("Test");
		ThrowsKeyword thr=new ThrowsKeyword();
		
		try{
		thr.getName();
	}	
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("check it");
	}

	public void getName() throws ArithmeticException{
		System.out.println("getName method");
		getValue();
	}
	
	public void getValue() throws ArithmeticException{
		
		System.out.println("getValue method");
		getNumber();
	}
	
	public void getNumber() throws ArithmeticException{
		System.out.println("getNumber method");
		int i=9/0;
	}
	
	
}
