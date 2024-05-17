package Utils;

public class StringUtils {

	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String LOCALHOST_URL = "jdbc:mysql://localhost:3306/plant_purchase_system";
	public static final String LOCALHOST_USERNAME = "root";
	public static final String LOCALHOST_PASSWORD = "";
	
	public static final String IMAGE_ROOT_PATH = "Users\\prithivi\\eclipse-workspace\\StudentManagement\\src\\main\\webapp\\resources\\images\\";
	public static final String IMAGE_DIR_PRODUCT = "C:/" + IMAGE_ROOT_PATH + "product\\";
	public static final String IMAGE_DIR_USER = "C:/" + IMAGE_ROOT_PATH + "user\\";
	
	public static final String Insert_User = "INSERT INTO user "
	        + "(user_name, user_email, user_password, user_phonenumber, location, user_is_admin)"
	        + " VALUES (?,?,?,?,?,?)";
	public static final String DELETE_PRODUCT = "DELETE FROM product WHERE Product_name = ?";

public static final String GET_LOGIN_USER_INFO = "SELECT* FROM user WHERE user_name=?";

public static final String QUERY_ADMIN_CHECK = "SELECT * FROM user WHERE user_name = ? AND user_is_admin = 1";
public static final String QUERY_GET_ALL_PRODUCTS="SELECT * FROM product";
public static final String QUERY_GET_ALL_PRODUCTS_FROM_PRODUCTNAME="SELECT * FROM product WHERE Product_name = ?";
public static final String INSERT_PRODUCT = "INSERT INTO product(Product_name,Product_description,Price,stock_level,Product_image)"
		+ "VALUES(?,?,?,?,?)";


// Start: Parameter names
public static final String USER_NAME = "user_name";
public static final String USER_EMAIL = "user_email";
public static final String PASSWORD = "user_password";
public static final String PHONE_NUMBER = "user_phonenumber";
public static final String LOCATION = "location";
public static final String USER_IS_ADMIN = "user_is_admin";
// End: Parameter names
// Start: Validation Messages
	// Register Page Messages
	public static final String MESSAGE_SUCCESS_REGISTER = "Successfully Registered!";
	public static final String MESSAGE_ERROR_REGISTER = "Please correct the form data.";
	public static final String MESSAGE_ERROR_USERNAME = "Username is already registered.";
	public static final String MESSAGE_ERROR_EMAIL = "Email is already registered.";
	public static final String MESSAGE_ERROR_PHONE_NUMBER = "Phone number is already registered.";
	public static final String MESSAGE_ERROR_PASSWORD_UNMATCHED = "Password is not matched.";
	public static final String DELETE_ID = "Product_name";


	// Login Page Messages
	public static final String MESSAGE_SUCCESS_LOGIN = "Successfully LoggedIn!";
	public static final String MESSAGE_ERROR_LOGIN = "Either username or password is not correct!";
	public static final String MESSAGE_ERROR_CREATE_ACCOUNT = "Account for this username is not registered! Please create a new account.";
	
	// Other Messages
	public static final String MESSAGE_ERROR_SERVER = "An unexpected server error occurred.";
	public static final String MESSAGE_SUCCESS_DELETE = "Successfully Deleted!";
	public static final String MESSAGE_ERROR_DELETE = "Cannot delete the user!";
	public static final String ERROR_INVALID_USERNAME = "Invalid username. Username should contain only letters (A-Z, a-z).";
	public static final String ERROR_INVALID_PHONE_NUMBER = "Invalid phone number. Phone number should contain exactly 10 digits and only integers.";
    public static final String ERROR_INVALID_EMAIL = "Invalid email format.";
    
	public static final String MESSAGE_SUCCESS = "successMessage";
	public static final String MESSAGE_ERROR = "errorMessage";
	// End: Validation Messages

	// Start: JSP Route
	public static final String PAGE_URL_LOGIN = "/pages/login.jsp";
	public static final String PAGE_URL_REGISTER = "/pages/register.jsp";
	public static final String PAGE_URL_WELCOME = "/index.jsp";
	public static final String PAGE_URL_HOME = "/pages/home.jsp";
	public static final String PAGE_URL_ADMIN = "/pages/admin.jsp";
	public static final String PAGE_URL_ADDED="/pages/AddProduct.jsp";
	
	
	public static final String PRODUCTLIST = "productLists";
	// End: JSP Route
	
	// Start: Servlets
	public static final String SERVLET_URL_REGISTER = "/register";
	// End: Servlets
	public static final String PRODUCT = "/product";
//	public static final String URL_INDEX = "Password is not matched.";

}

