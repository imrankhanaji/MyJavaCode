package javaSessions;

public class Login {

	public static void main(String[] args) {
		
		Login lp=new Login();
		lp.login();
		lp.login("imran", 87656);
		lp.login("imrankkhan", "test@123");

	}
	
	public void login() {
		
		System.out.println("Default login method");
		
	}
	
	public void login(String username, String password) {
		System.out.println("login method with multiple parameter");
	}
	
	public void login(String username, int otp) {
		System.out.println("login method with multiple params otp");
	}

}
