package abstractmethods;

public abstract class Page {
	
	public Page() {
		System.out.println("constructor-page class");
	}
	
	abstract void header();
	
	abstract void title();
	
	public void footer() {
		
		System.out.println("Page-footer method");
	}
	
	

}
