package example3;

public class LogInAPIAdapter implements LogInInterface {
	
	public LogInAPI logInAPI;
	
	public LogInAPIAdapter(LogInAPI logInAPI) {
		this.logInAPI=logInAPI;
	}

	@Override
	public String logInService() {
		
		return this.logInAPI.logIn();
	}
}
