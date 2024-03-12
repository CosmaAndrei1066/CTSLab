
public class SingletonExample {

	public static void main(String[] args) {
		//SINGLETON
		//get instance in main cuz you cant instanciate
		Singleton singleton = Singleton.getInstance();
		
		singleton.doSomething();		
	}	
}

