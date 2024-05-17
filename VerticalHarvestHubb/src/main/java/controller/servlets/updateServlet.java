package controller.servlets;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.productModel;
import controller.database.DBController;

@WebServlet(asyncSupported = true, urlPatterns= "/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final DBController dbController = new DBController();
	// updateServlet.java

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String productName = request.getParameter("productName");

	    if (productName == null || productName.isEmpty()) {
	        // Handle error or redirection
	        request.getRequestDispatcher("/pages/update.jsp").forward(request, response);
	        return;
	    }

	    try {
	        productModel product = dbController.getProductByName(productName);
	        request.setAttribute("product", product);
	        request.getRequestDispatcher("/pages/update.jsp").forward(request, response);
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace(); // Log or handle the exception
	        // Optionally, redirect to an error page
	        // response.sendRedirect("error.jsp");
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String productName = request.getParameter("productName");

	    if (productName == null || productName.isEmpty()) {
	        request.getRequestDispatcher("/pages/update.jsp").forward(request, response);
	        return;
	    }

	    try {
	        productModel product = dbController.getProductByName(productName);
	        request.setAttribute("product", product);
	        request.getRequestDispatcher("/pages/update.jsp").forward(request, response);
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace(); // Log or handle the exception
	        // Optionally, redirect to an error page
	        // response.sendRedirect("error.jsp");
	    }
	}
} 