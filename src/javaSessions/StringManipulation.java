package javaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="Hi Imran This is my java code i am very happy it is good";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(9));
		
		System.out.println(str.indexOf('s'));// 1st occurence of s
		
		System.out.println(str.charAt(35));
		
		System.out.println(str.indexOf('s', 13)); // 2nd occurence of s
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println(str.lastIndexOf('s'));
		
		System.out.println(str.indexOf("java"));
		
		String mesg="welcome user";
		
		if(mesg.indexOf("admin")>0) {
			
			System.out.println("Admin value is available");
		}
		else {
			System.out.println(mesg+" "+"Admin value is not available");
		}
		System.out.println("---------------");
		String t1="   Hello user   ";
		System.out.println(t1.trim());
		System.out.println(t1.replace(" ", ""));
		//ucase lcase
		
		String h1="  hello IMran in small case   ";
		
		System.out.println(h1.toUpperCase());
		
		System.out.println(h1.trim().toLowerCase());
		
		String text="Hello world";
		System.out.println(text.contains("World"));
		System.out.println(text.equalsIgnoreCase(text));
		
		//String comparison
		
		String s1=" Hello This is my java code ";
		String s2="Hello this is my java code";
		
		//String ss1=s1.replace(" ", "");
		//System.out.println(ss1);
		
		if(s1.trim().equalsIgnoreCase(s2)) {
			System.out.println("value matches");
		}
		else {
			System.out.println("value not matches");
		}
		
		System.out.println("-------------");
		
		String msg="Agreement reference number is 2343456567";
		
		System.out.println(msg.substring(msg.trim().indexOf("is")+3));
		
		System.out.println(msg.substring(msg.indexOf("is")+3, msg.length()));
		
		// split
		
		String lang="Tamil-English-Malayalam-Telugu";
		
		String language[]=lang.split("-");
		
		for(int i=0;i<language.length;i++) {
			System.out.println(language[i]);
		}
		
		for(String i:language) {
			System.out.println(i);
			
		}
		System.out.println("----");
		
		String name="XximranXxkhanXXxajmal";
		String names[]=name.split("Xx");
		
		for(String s:names) {
			System.out.println(s);
			
		}
		
		String empData="Imran;31;M;87876;CG";
		
		for(int i=0;i<empData.split(";").length;i++) {
			System.out.println(empData.split(";")[i]);
		}
		
	}

}
