//Singleton EXAMPLE 1
public class Singleton {
	// private static instance variable
	private static Singleton instance;
	
	//private constructor to prevent instantiation from outside the class
	private Singleton() {
		//initialization code if needed
	}
	
	//public method to get the instance of the singleton class
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Singleton is doing something!");
	}
}
