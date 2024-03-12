//Singleton EXAMPLE 2
public class DatabaseConnection {
	
	//Private volatile instance variable to ensure flexibility across threads
	private static volatile DatabaseConnection instance;
	
	//private ctor to prevent instances
	private DatabaseConnection() {
		//init code if needed
	}
	
	//Double check!!!! (doua de if instance==null) - locking for thread safety and lazy initialization
	// use synchronized to have two threads finding instance = null and creating new instances
	public static DatabaseConnection agetInstance() {
		if(instance == null) {
			synchronized (DatabaseConnection.class) {
				if(instance==null) {
					instance = new DatabaseConnection();
				}
			}
		}
		return instance;
	}
}
