package javaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		 ar.add(100);
		 ar.add(200);
		 ar.add("Imran");
		 ar.add('M');
		 ar.add(null);
		 System.out.println(ar.get(4));
		 System.out.println(ar.size());
		 System.out.println("---------------");
		 
		 ArrayList<String> studentNames=new ArrayList<String>();
		 studentNames.add("Imran");
		 studentNames.add("Priya");
		 studentNames.add("priya");
		 
		 for(int i=0;i<studentNames.size();i++) {
			 System.out.println(studentNames.get(i));
		 }
			 
			 ArrayList<Integer> arr=new ArrayList<Integer>();
			 arr.add(100);
			 arr.add(200);
			 arr.add(900);
			 arr.add(10000);
			 arr.add(0);
			 
			// for(int s:arr) {
				 
				 System.out.println(arr);
				 
			// convert to static Array
				 
				 Integer a[]=new Integer[arr.size()];
				 arr.toArray(a);
				for (int k=0;k<a.length;k++) {
					System.out.println(a[k]);
				}
				 
			 }
			 
			 
			 
		 
	

}
