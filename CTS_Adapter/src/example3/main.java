package example3;

public class main {

	public static void main(String[] args) {
		
		LogInAPIAdapter LIAdapter = new LogInAPIAdapter(new LogInAPI());
		
		System.out.println(LIAdapter.logInService());
	}

}
