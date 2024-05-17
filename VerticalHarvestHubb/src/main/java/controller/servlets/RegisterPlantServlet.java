package controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.userModel;
import Utils.StringUtils;
import controller.database.DBController;

/**
 * Servlet implementation class RegisterPlantServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/registeruser" })
public class RegisterPlantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final DBController dbController;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterPlantServlet() {
    	this.dbController= new DBController();
    }
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String user_name = request.getParameter(StringUtils.USER_NAME);
        String user_email = request.getParameter(StringUtils.USER_EMAIL);
        String user_password = request.getParameter(StringUtils.PASSWORD);
        String user_phonenumber = request.getParameter(StringUtils.PHONE_NUMBER);
        String user_location = request.getParameter(StringUtils.LOCATION);
        boolean user_is_admin = Boolean.parseBoolean(request.getParameter(StringUtils.USER_IS_ADMIN));
        
        if (!isValidUsername(user_name)) {
            // If username is invalid, set an error message attribute in the request
            request.setAttribute("error", StringUtils.ERROR_INVALID_USERNAME);
            // Redirect back to registration page
            request.getRequestDispatcher("/pages/register.jsp").forward(request, response);
            return;
        }
        
        if (dbController.isUsernameExists(user_name)) {
            // If the username already exists, set an error message attribute in the request
            request.setAttribute("error", "Username already exists. Please choose a different username.");
            // Redirect back to registration page
            request.getRequestDispatcher("/pages/register.jsp").forward(request, response);
            return;
        }
        if (dbController.isEmailExists(user_email)) {
            // If the email already exists, set an error message attribute in the request
            request.setAttribute("error", "Email already exists. Please choose a different email.");
            // Redirect back to registration page
            request.getRequestDispatcher("/pages/register.jsp").forward(request, response);
            return;
        }
        if (dbController.isPhoneNumberExists(user_phonenumber)) {
            // If the phone number already exists, set an error message attribute in the request
            request.setAttribute("error", "Phone number already exists. Please choose a different phone number.");
            // Redirect back to registration page
            request.getRequestDispatcher("/pages/register.jsp").forward(request, response);
            return;
        }


        if (!isValidPhoneNumber(user_phonenumber)) {
            // If phone number is invalid, set an error message attribute in the request
            request.setAttribute("error", StringUtils.ERROR_INVALID_PHONE_NUMBER);
            // Redirect back to registration page
            request.getRequestDispatcher("/pages//register.jsp").forward(request, response);
            return;
        }
        
        if (!isValidEmail(user_email)) {
            // If email is invalid, set an error message attribute in the request
            request.setAttribute("error", StringUtils.ERROR_INVALID_EMAIL);
            // Redirect back to registration page
            request.getRequestDispatcher("/register.jsp").forward(request, response);
            return;
        }


        userModel user = new userModel(user_name, user_email, user_password, user_phonenumber, user_location,
                user_is_admin);

        int result = dbController.registeruser(user);
        if (result == 1) {
            // Registration successful, redirect to login page
            response.sendRedirect(request.getContextPath() + StringUtils.PAGE_URL_LOGIN);
        } else {

    
        }
    }
    private boolean isValidEmail(String user_email) {
    	return user_email != null && user_email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

		// TODO Auto-generated method stub
	}
	private boolean isValidUsername(String user_name) {
        // Username should contain only letters (a-z, A-Z)
        return user_name != null && user_name.matches("[a-zA-Z]+");
    }

    private boolean isValidPhoneNumber(String user_phonenumber) {
        // Phone number should contain exactly 10 digits and only integers
        return user_phonenumber != null && user_phonenumber.matches("\\d{10}");
    }
	private boolean isUsernameUnique(String user_name) {
		// TODO Auto-generated method stub
		return false;
	}
    
}	
	

