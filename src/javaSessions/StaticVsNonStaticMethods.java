package javaSessions;

import java.util.ArrayList;

public class StaticVsNonStaticMethods {
	
	//print the student marks
	String name;
	int marks;
	int rollnumber;
	String Subject;
	
	public static void display() {
		System.out.println("get studentname method");
		
	}
	
	public int getStudentMarks(String name) {
		this.name=name;
		int marks=-1;
		if(name.equalsIgnoreCase("kalpana")) {
			marks= 100;
		}
			else if(name.equalsIgnoreCase("Imran")) {
				marks= 50;	
			}
				else if(name.equalsIgnoreCase("Ansari")) {
					marks= 60;	
				}
				else {
					System.out.println(name + " "+ "not found");
				}
			return marks;
		}
	
	public ArrayList<String> getDeptList() {
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("sales");
		arr.add("financial");
		arr.add("HR");
		
//		for(String x:arr) {
//			System.out.println(x);
//		}
		
		return arr;
		
		
	}
	
	
	public static void main(String[] args) {
		
		StaticVsNonStaticMethods obj=new StaticVsNonStaticMethods();
		int s1=obj.getStudentMarks("ajmal");
		System.out.println(s1);
		
		System.out.println(obj.getDeptList());
		display();
		}
	

}
