package javaSessions;

public class ThrowKeyword {

	public static void main(String[] args)  {
		
		try {
		throw new Exception("my exception");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
