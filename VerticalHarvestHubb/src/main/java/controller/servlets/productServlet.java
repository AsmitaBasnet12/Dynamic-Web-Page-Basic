package controller.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Model.productModel;
import Utils.StringUtils;
import controller.database.DBController;


/**
 * Servlet implementation class productServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/productServlet" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50)
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final DBController dbController = new DBController();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<productModel> pro = dbController.getAllProductInfo();
		request.setAttribute(StringUtils.PRODUCTLIST, pro);
		request.getRequestDispatcher(StringUtils.PAGE_URL_ADDED).forward(request, response);
		
	} 
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Product_name = request.getParameter("Product_name");
		String Product_description = request.getParameter("Product_description");
		String Price = request.getParameter("Price");
		String stock_level = request.getParameter("stock_level");
		String Product_image = request.getParameter("Product_image");
		System.out.println("hi");
		


		// Print received product details
		System.out.println("Received product details:");
		System.out.println("Product_name: " + Product_name);
		System.out.println("Product_description: " + Product_description);
		System.out.println("Price: " + Price);
		System.out.println("stock_level: " + stock_level);
		System.out.println("Product_image: " + Product_image);

		// Create a product object with the received data
		productModel product = new productModel( Product_name, Product_description, Price, stock_level, Product_image);

		// Instantiate the DBController
		DBController dbController1 = new DBController();

		// Add the product to the database
		int result = dbController1.addProduct(product);

		if (result > 0) {
			// Product added successfully
			System.out.println("Product added successfully");
			response.sendRedirect(request.getContextPath() + "/productServlet");
		} else {
			// Product addition failed
			System.out.println("Product addition failed");
			response.sendRedirect(request.getContextPath() + StringUtils.PAGE_URL_ADMIN);
		}
	}
	
}