package javaSessions;

import java.util.ArrayList;

public class StaticArrayTest {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		    a[0]=10;
		    a[1]=20;
		    a[2]=30;
		    a[3]=40;
		    
		System.out.println(a[0]);
		for(int x:a) {
			System.out.println(x);
		}
		
		char c[]=new char[2];
		c[0]='M';
		c[1]='F';
		
		System.out.println(c[0]+c[1]);
		
		String s[]=new String[3];
		s[0]="Java";
		s[1]="Ruby";
		s[2]="python";
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("selenium");
		ar.add("ruby");
		
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
	}

}
