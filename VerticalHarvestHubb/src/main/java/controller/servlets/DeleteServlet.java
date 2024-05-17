package controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.database.DBController;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/deleteProductServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final DBController dbController;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        // TODO Auto-generated constructor stub
        this.dbController = new DBController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("Product_name");

		try {
			dbController.deleteProduct(productName);
			response.sendRedirect(request.getContextPath() + "/productServlet"); // Redirect to the products page
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
