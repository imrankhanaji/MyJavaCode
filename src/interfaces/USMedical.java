package interfaces;

public interface USMedical {
	
	int fees=10;
	//Abstract methods
	public void neuroServices();
	
	public void arthoServices();
	
	public static void display() {
		System.out.println("USMedical-display method");
	}
	
	default void billing() {
		System.out.println("USMedical default- billing method");
	}

}
