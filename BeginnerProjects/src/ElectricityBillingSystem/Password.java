package ElectricityBillingSystem;

public class Password {

	private String password = "Chair2460";
	private String userName = "saidrah4141";
	boolean access = false;
	
	
	
	public void checkLogin(String Pass, String User) {
		String pass= Pass;
		String user= User;
		if(password.equals(pass) && userName.equals(user)) {
			access = true;
		} else {
			access =false;
		}
	}
	
	public boolean checkAccess() {
		return(access);
	}
	
	
	
}
