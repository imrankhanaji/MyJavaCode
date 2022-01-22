package javaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {
		
		int a[]=new int[2];
		    a[0]=50;
		    a[1]=20;
		    
		  // System.out.println(a.length);
		   // 866802574
		
		
		float f[]=new float[1];
		      
		  System.out.println(f[0]);
		      
		String studentname[]=new String[3];
		
			 studentname[0]="Imran";
			 studentname[1]="Sumathy";
			 studentname[2]="Priya";
			 
			 for(int i=0;i<studentname.length;i++) {
				 System.out.println(studentname[i]);
				 
			 }
			 
			 ArrayList<String> al=new ArrayList<String>(Arrays.asList(studentname));
			 System.out.println(al);
			 
			 System.out.println("--------------");
			 
			  System.out.println("--------------");
			 char c[]=new char[2];
		 	  c[0]='a';
		 	 // c[1]='b';
		 	// System.out.println(c[0]+c[1]); // summation of char always give ascii value
		 	  //System.out.println(" characters are " + c[0]+c[1]);
		 	  System.out.println(c[1]);
		 	  
		 	  Object obj []  =new Object[3];
		 	         obj[0]="Imran";
		 	         obj[1]=65000;
		 	         obj[2]='M';
		 	  
		 	        for(int j=0;j<obj.length;j++) {
						 System.out.println(obj[j]);
						 
					 }

	}

}
