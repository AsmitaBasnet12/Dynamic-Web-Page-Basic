package Model;

public class loginModel {
	private String user_name;
	private String user_password;

	public loginModel(String username, String password) {
		this.user_name = username;
		this.user_password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
}