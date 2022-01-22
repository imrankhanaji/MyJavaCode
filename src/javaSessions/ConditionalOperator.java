package javaSessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		String browser="opera";
		if(browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch the chrome browser");
		}
		
		else if(browser.equalsIgnoreCase("safari")) {
			System.out.println("Launch the safari browser");
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Launch the firefox browser");
		}	
		
		else
		{
			System.out.println("Please pass the correct browser name: " + browser + " " + "is not found");
		}
		
		//numeric comparison
		
		int x=100;
		int y=400;
		int z=700;
		
		if(x>y && x>z) {
			System.out.println("x is the highest number");
			
		}
		else if(y>z) {
			System.out.println("y is the highest number");
		}
		
		else {
			System.out.println("z is the highest number" + " " + z);
		}
		
		// switch case
		
		String days="tuesday";
		switch (days) {
		case "monday":
			System.out.println("Entered value is monday");
			break;

		default:
			System.out.println("Entered value not found");
			break;

		}
	
	}
	
}


