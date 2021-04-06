package shoppingProject;
import java.util.*;

public class Customer {
	
	static int C = 1;
	int CustomerId;
	String fname;
	String lname;
	String Email;
	String Username;
	String Password;
	
		Customer(String fname, String lname,String Email, String Username, String Password) {
		
			this.fname = fname;
			this.lname = lname;
			this.Email = Email;
			this.Username = Username;
			this.Password = Password;
			this.CustomerId = C++;
	}
	
	public boolean login(String Username , String Password) {
		
			boolean isEqual = this.Username == Username && this.Password == Password;
					return isEqual;
			
	}
	
	@Override
	public int hashCode() {
		return Username.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Customer that = (Customer)obj;
		boolean isEqual = this.Username == that.Username;
		return isEqual;
	}
	
	public void getCustomerDetails() {
		System.out.println("Customer Details: ");
		System.out.println("Name: "+ fname+" "+lname);
		System.out.println("Email: "+Email);
		System.out.println("CustomerId: "+ CustomerId);
	}
	public  int getCustomerId() {
		return CustomerId;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getEmail() {
		return Email;
	}

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}
	
}
