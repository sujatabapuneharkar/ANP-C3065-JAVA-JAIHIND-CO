package com.mymart.model1;
import java.util.Objects;

public class Product {
private int productId;
private String productName;
private double productPrice;
public Product(int productId, String productName,double productPrice) {
	super();
	this.productId = productId;
    this. productName= productName;
    this. productPrice=productPrice;
}
public int getProductId() {
	return productId;
	
}
public void setProductId(int productId) {
	this.productId=productId;
}
public String getProductName() {
	return productName;
	
}
public void setProductId(String productName) {
	this.productName=productName;
}
	public double getProductPrice() {
		return productPrice;
		
	}
	public void setProductPrice(int productPrice) {
		this.productPrice=productPrice;
	}
	public Product() {
		super();
		
		// TODO Auto-generated method stub

	}
@Override
public String toString() {
	return "Product [productId=" +productId +",productName=" +productName +",productPrice=" +productPrice+",]";
}
@Override
public int hashCode() {
	return Objects.hash(productId,productName,productPrice);
}
}
