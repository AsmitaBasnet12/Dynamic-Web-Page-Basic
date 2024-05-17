package controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.loginModel;
import Utils.StringUtils;
import controller.database.DBController;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/loginuser", asyncSupported = true)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final DBController dbController;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	this.dbController = new DBController();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String userName = request.getParameter(StringUtils.USER_NAME);
	        String password = request.getParameter(StringUtils.PASSWORD);
	        System.out.println("Received username: " + userName);
	        System.out.println("Received password: " + password);

	        
	        loginModel loginModel = new loginModel(userName, password);
	        
	        int authenticationResult = dbController.getStudentLoginInfo(loginModel);
	        System.out.println("Authentication result: " + authenticationResult);

	        String role = null;

	        // Call the DatabaseController to validate the user credentials
	        if (authenticationResult == 1) {
	            // Login successful
	            HttpSession userSession = request.getSession();
	            userSession.setAttribute(StringUtils.USER_NAME, userName);
	            userSession.setMaxInactiveInterval(30 * 60);

	            Cookie userCookie = new Cookie(StringUtils.USER_NAME, userName);
	            userCookie.setMaxAge(30 * 60);
	            response.addCookie(userCookie);

	            request.setAttribute(StringUtils.MESSAGE_SUCCESS, StringUtils.MESSAGE_SUCCESS_LOGIN);
	            // Check if the user is an admin
	            if (dbController.isAdmin(userName)) {
	                System.out.println("Admin Login");
	                response.sendRedirect(request.getContextPath() + "/pages/admin.jsp");
	                /*request.getRequestDispatcher(StringUtils.PAGE_URL_ADMIN).forward(request, response);*/
	            } else {
	                System.out.println("User Login");
	                response.sendRedirect(request.getContextPath() + "/index.jsp");
	                /*request.getRequestDispatcher(StringUtils.PAGE_URL_WELCOME).forward(request, response);*/
	            }
	        } else if (authenticationResult == 0) {
	            // Username or Password Missmatch
	        	System.out.println("username or pw mismatch");
	            request.setAttribute(StringUtils.MESSAGE_ERROR, StringUtils.MESSAGE_ERROR_LOGIN);
	            request.setAttribute(StringUtils.USER_NAME, userName);
	            response.sendRedirect(request.getContextPath() + StringUtils.PAGE_URL_REGISTER);
	        } else if (authenticationResult == -1) {
	            // Username not Found
	            System.out.println("Username not Found");
	            request.setAttribute(StringUtils.MESSAGE_ERROR, StringUtils.MESSAGE_ERROR_CREATE_ACCOUNT);
	            request.setAttribute(StringUtils.USER_NAME, userName);
	            response.sendRedirect(request.getContextPath() + StringUtils.PAGE_URL_REGISTER);
	        } else {
	            // Server Error
	            System.out.println("Server Error");
	            request.setAttribute(StringUtils.MESSAGE_ERROR, StringUtils.MESSAGE_ERROR_SERVER);
	            request.setAttribute(StringUtils.USER_NAME, userName);
	            request.getRequestDispatcher(StringUtils.PAGE_URL_WELCOME).forward(request, response);
	        }
	     }
	 }
