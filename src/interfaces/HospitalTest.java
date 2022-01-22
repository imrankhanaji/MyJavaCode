package interfaces;

public class HospitalTest {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.arthoServices();
		fh.ENTServices();
		
		System.out.println(USMedical.fees);
		USMedical.display();
		fh.billing();
		System.out.println("------");
		
		IndianMedical im=new FortisHospital();
		im.ENTServices();
		im.pediaServices();
		
		
	}

}
