package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//While
		int x=0;
		while(x<=10) {
			
			System.out.println(x);
			x++;
			
		}
		System.out.println("--------");
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i<=10) {
				System.out.println("i is lesser than 10");
				
			}
		}
		System.out.println("--------");
		//do while
		int count=10;
		do {
			System.out.println(count);
			count=count-1;
		}
		while(count>=0);

	}

}
