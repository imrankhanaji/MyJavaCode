package javaSessions;

public class CandidateCheck {

	String name;
	int age;
	private int salary;
	
	public void test(String name) {
		this.name=name;
	}
	
	public int getSalaryInfo(int salary) {
		this.salary=salary;
		return salary;
	}
}
