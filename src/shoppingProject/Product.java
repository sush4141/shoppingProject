package shoppingProject;
import java.util.*;

public class Product {
	
	static int PId=0;
	int ProductId=0;
	String name;
	double price;
	
	Product(String name, double price){
		
		this.name = name;
		this.price = price;
		PId++;
		ProductId = PId;
	}

	public double bill(int q){
		return price*q;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public void ProductDetails() {
		
		System.out.println("Product Name: "+ name);
		System.out.println("Unit Price: " + price);
		System.out.println("Product ID: "+ ProductId);	
	}
	
	
	@Override
	public String toString() {
		
		return "Product: "+this.name + "||" +" Unit Price: Rs." + this.price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public int getProductId() {
		return ProductId;
	}
	
}
