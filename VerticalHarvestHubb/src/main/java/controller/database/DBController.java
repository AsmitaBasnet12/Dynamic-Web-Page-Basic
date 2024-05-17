package controller.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.PasswordEncryptionWithAes;
import Model.loginModel;
import Model.productModel;
import Model.userModel;
import Utils.StringUtils;
import controller.servlets.productServlet;

public class DBController {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(StringUtils.DRIVER_NAME);
		return DriverManager.getConnection(StringUtils.LOCALHOST_URL, StringUtils.LOCALHOST_USERNAME,
				StringUtils.LOCALHOST_PASSWORD);

	}

	public int registeruser(userModel user) {
		try (Connection con = getConnection()) {
			PreparedStatement stmt = con.prepareStatement(StringUtils.Insert_User);
			stmt.setString(1, user.getUser_name());
			stmt.setString(2, user.getUser_email());
			stmt.setString(3, PasswordEncryptionWithAes.encrypt(user.getUser_name(), user.getUser_password()));
			stmt.setString(4, user.getUser_phonenumber());
			stmt.setString(5, user.getLocation());
			stmt.setBoolean(6, user.isUser_is_admin());

			int result = stmt.executeUpdate();

			if (result > 0) {
				return 1; // Successful registration
			} else {
				return 0; // Registration failed
			}
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace(); // Log the exception for debugging
			return -1; // Error occurred
		}
	}
	public boolean isUsernameExists(String username) {
	    try (Connection con = getConnection()) {
	        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM user WHERE user_name = ?");
	        stmt.setString(1, username);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            int count = rs.getInt(1);
	            return count > 0; // If count is greater than 0, username already exists
	        }
	    } catch (SQLException | ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }
	    return false; // Error occurred or username not found
	}
	public boolean isEmailExists(String email) {
	    try (Connection con = getConnection()) {
	        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM user WHERE user_email = ?");
	        stmt.setString(1, email);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            int count = rs.getInt(1);
	            return count > 0; // If count is greater than 0, email already exists
	        }
	    } catch (SQLException | ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }
	    return false; // Error occurred or email not found
	}
	
	public boolean isPhoneNumberExists(String phoneNumber) {
	    try (Connection con = getConnection()) {
	        PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM user WHERE user_phonenumber = ?");
	        stmt.setString(1, phoneNumber);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            int count = rs.getInt(1);
	            return count > 0; // If count is greater than 0, phone number already exists
	        }
	    } catch (SQLException | ClassNotFoundException ex) {
	        ex.printStackTrace();
	    }
	    return false; // Error occurred or phone number not found
	}



	public int getStudentLoginInfo(loginModel loginModel) {
		try {

			PreparedStatement st = getConnection().prepareStatement(StringUtils.GET_LOGIN_USER_INFO);

			st.setString(1, loginModel.getUser_name());

			ResultSet result = st.executeQuery();

			if (result.next()) {
				String userDb = result.getString(StringUtils.USER_NAME);

				String encryptedPwd = result.getString(StringUtils.PASSWORD);
				String decryptedPwd = PasswordEncryptionWithAes.decrypt(encryptedPwd, userDb);

				if (userDb.equals(loginModel.getUser_name()) && decryptedPwd != null
						&& decryptedPwd.equals(loginModel.getUser_password())) {
					return 1;
				} else {

					return 0;
				}
			} else {

				return -1;
			}

		} catch (SQLException | ClassNotFoundException ex) {

			ex.printStackTrace();

			return -2;
		}
	}

	/*
	 * public Boolean checkEmailIfExists(String email) { return false; }
	 * 
	 * public Boolean checkNumberIfExists(String number) { return false; }
	 * 
	 * public Boolean checkUsernameIfExists(String username) { return false; }
	 */

	public boolean isAdmin(String username) {
		try {
			// Prepare a statement using the predefined SQL query for login
			PreparedStatement st = getConnection().prepareStatement(StringUtils.QUERY_ADMIN_CHECK);

			// Set the username in the query
			st.setString(1, username);

			// Execute the query
			ResultSet result = st.executeQuery();

			// Check if the result set is empty
			return result.next();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}

	}

	public int addProduct(productModel product) {
		try (Connection con = getConnection()) {
			PreparedStatement stmt = con.prepareStatement(StringUtils.INSERT_PRODUCT);
			stmt.setString(1, product.getProduct_name());
			stmt.setString(2, product.getProduct_description());
			stmt.setString(3, product.getPrice());
			stmt.setString(4, product.getStock_level());
			stmt.setString(5, product.getProduct_image());

			// Set the image data

			int result = stmt.executeUpdate();

			if (result > 0) {
				return 1; // Successful product insertion
			} else {
				return 0; // Product insertion failed
			}
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace(); // Log the exception for debugging
			return -1; // Error occurred
		}

	}

	public ArrayList<productModel> getAllProductInfo() {
		try {
			PreparedStatement stmt = getConnection().prepareStatement(StringUtils.QUERY_GET_ALL_PRODUCTS);
			ResultSet result = stmt.executeQuery();

			ArrayList<productModel> pro = new ArrayList<productModel>();

			while (result.next()) {

				productModel product = new productModel();
				product.setProduct_name(result.getString("Product_name"));
				product.setProduct_description(result.getString("Product_description"));
				product.setPrice(result.getString("Price"));
				product.setStock_level(result.getString("stock_level"));
				product.setProduct_image(result.getString("Product_image"));
				pro.add(product);
			}
			return pro;
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	
	public int deleteProduct(String productName) {
		try (Connection con = getConnection()) {
			PreparedStatement stmt = con.prepareStatement(StringUtils.DELETE_PRODUCT);
			stmt.setString(1, productName);

			int result = stmt.executeUpdate();

			if (result > 0) {
				return 1; // Successful deletion
			} else {
				return 0; // Deletion failed
			}
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace(); // Log the exception for debugging
			return -1; // Error occurred
		}
	}
	
	  public  productModel getProductByName(String productName) throws SQLException, ClassNotFoundException {
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        productModel product = null;
	        
	        try {
	            con = getConnection();
	            ps = con.prepareStatement(StringUtils.QUERY_GET_ALL_PRODUCTS_FROM_PRODUCTNAME);
	            ps.setString(1, productName);
	            System.out.println("hello");
	            rs = ps.executeQuery();
	            System.out.println("hi");
	            
	            if (rs.next()) {
	                product = new productModel();
	               
	                product.setProduct_name(rs.getString("Product_name"));
	                product.setProduct_description(rs.getString("Product_description"));
	                product.setPrice(rs.getString("Price"));
	                product.setStock_level(rs.getString("stock_level"));
	                product.setProduct_image(rs.getString("Product_image"));
	                
	            }
	            System.out.println("Product Name" + product.getProduct_name());
	            return product;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            // Handle database error
	        } finally {
	            // Close resources
	            try {
	                if (rs != null) rs.close();
	                if (ps != null) ps.close();
	                if (con != null) con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        return product;
	    }
	}


