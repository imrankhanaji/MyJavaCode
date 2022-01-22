package interfaces;

public class FortisHospital implements USMedical,IndianMedical {

	@Override
	public void neuroServices() {
		
		System.out.println("USMedical-neuroServices");
	}

	@Override
	public void arthoServices() {
		
		System.out.println("USMedical-arthoServices");
		
	}
	
	@Override
	public void ENTServices() {
		
		System.out.println("IndianMedical-ENTServices");
		
	}

	@Override
	public void pediaServices() {
		
		System.out.println("IndianMedical-pediaServices");
		
	}
	
	public static void display() {
		System.out.println("USMedical-display method");
	}

}
