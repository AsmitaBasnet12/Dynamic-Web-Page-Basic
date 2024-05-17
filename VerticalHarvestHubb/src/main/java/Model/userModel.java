package Model;

public class userModel {
	private static final long serialVersionUID = 1L;
	private String user_name;
	private String user_email;
	private String user_password;
	private String user_phonenumber;
	private String location;
	private boolean user_is_admin;

	public userModel(String user_name, String user_email, String user_password, String user_phonenumber,
			String location, boolean user_is_admin) {
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_phonenumber = user_phonenumber;
		this.location = location;
		this.user_is_admin = user_is_admin;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_phonenumber() {
		return user_phonenumber;
	}

	public void setUser_phonenumber(String user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isUser_is_admin() {
		return user_is_admin;
	}

	public void setUser_is_admin(boolean user_is_admin) {
		this.user_is_admin = user_is_admin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
