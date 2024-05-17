package Model;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.Part;

import Utils.StringUtils;

public class productModel {
	private String Product_name;
	private String Product_description;
	private String Price;
	private String stock_level;
	private String Product_image;

	public productModel() {
	}

	public productModel(String Product_name, String Product_description, String Price, String stock_level,
			String Product_image) {
		
		this.Product_name = Product_name;
		this.Product_description = Product_description;
		this.Price = Price;
		this.stock_level = stock_level;
		this.Product_image = Product_image;
	}

	

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getProduct_description() {
		return Product_description;
	}

	public void setProduct_description(String product_description) {
		Product_description = product_description;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getStock_level() {
		return stock_level;
	}

	public void setStock_level(String stock_level) {
		this.stock_level = stock_level;
	}

	public String getProduct_image() {
		return Product_image;
	}

	public void setProduct_image(String product_image) {
		Product_image = product_image;
	}



}
