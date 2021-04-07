package shoppingProject;

import java.util.*;

public class App {

	static int OId=0;
	Scanner sc = new Scanner(System.in);
	boolean isLog = false;
	boolean isReg = false;
	boolean flag2 = false;
	String fname,lname,Username,Password,Email;
	int Cid;
	
	ArrayList<Customer> Cust= new ArrayList<>();
	List<Integer> Q = new ArrayList<>();
	
	List<Product> OrderList = new ArrayList<Product>();
	
	
	public void Run(List<Product> ProductList){
		
		Iterator<Customer> itr = Cust.iterator();
		System.out.println("_____________EKart____________");
		int ch;
		do {
			System.out.println("Select Option: 1. Register 2.Login 3.Order 4.Exit");
			do {
					ch=sc.nextInt();
					if(ch<1 || ch > 4)
						System.out.println("Invalid choice!");
				
			}while(ch< 1 || ch > 4);
			
			switch(ch) {
		
			case 1:
				try{
						System.out.println("Hello there! Enter your details:");
						
						System.out.println("Enter First Name: ");
						fname = sc.next();
						System.out.println("Enter Last Name: ");
						lname = sc.next();
						System.out.println("Enter Email: ");
						Email = sc.next();
						
						System.out.println("Enter Username:");
						Username = sc.next();
						System.out.println("Enter Password:");
						Password = sc.next();
						Cust.add(new Customer(fname,lname,Email,Username,Password));
						System.out.println("Customer added sucessfully!");
						System.out.println();
						
				}
				catch(Exception e) {
						e.printStackTrace();
				}
				break;
				
			case 2:
				
				if(!Cust.isEmpty()) {
				try {
						System.out.println("Welcome to login page: ");
						System.out.println("Enter Username: ");
						Username = sc.next();
						System.out.println("Enter Password: ");
						Password = sc.next();
				
						for(Customer f: Cust) {
		
						if(f.Username.equals(Username) && f.Password.equals(Password))
						{
							Cid = f.getCustomerId();
							System.out.println("Logged in sucessfully! ");
							System.out.println();
							isLog = true;
							
							break;
						}
						if(isLog == false)
							System.out.println("User Dose not exist");
						
					}
						
				}
				catch(Exception e) {
					e.fillInStackTrace();
				}
				break;
				}
				
				else {
					System.out.println("No user is registered in the system. Register first to login.");
					break;
				}
				
			case 3:
				double totalPrice=0;
				if(isLog) {
				do {
					System.out.println("Select Option: 1. Add Item 2. Make Bill");
					int flag;
					
					do {
						flag=sc.nextInt();
						if(flag<1 || flag > 2)
							System.out.println("Invalid choice!");
					
				   }while(flag< 1 || flag > 2);
					
				switch(flag) {
				
				case 1:
					int i=1,choice;
					System.out.println("Select the product:");
					
					ProductList.forEach(System.out::println);
					
					 do {
							choice=sc.nextInt();
							if(choice<1 || choice > 8)
								System.out.println("Invalid choice!");
						
					}while(choice< 1 || choice > 8);
					 
					 int q;
					 System.out.println("Enter quantity: ");
					 q = sc.nextInt();
					 Q.add(q);
					 
					 
					 System.out.println("");
					 OrderList.add(ProductList.get(choice));
					 totalPrice += ProductList.get(choice).bill(q);
					 break;
					 
				case 2:
					
					System.out.println();
					System.out.println("Bill: ");
					System.out.println("Order ID: "+ ++OId);
					System.out.println("Product Details: ");
					int j=0;
					for(Product p: OrderList)
					{
						p.ProductDetails();
						System.out.println("Quantity Ordered: "+ Q.get(j));
						System.out.println();
					
					}
					System.out.println("Total Bill: Rs."+totalPrice );
					System.out.println();
					break;
					
				}
					
			}while(true);
			}
			else {
					System.out.println("Login First..!");
					break;
				}
			
			case 4:
				sc.close();
				System.exit(0);
			}
			
		}while(true);
	}
		
	public static void main(String[] args) {
		
		App A1 = new App();
		
		Product Book = new Product("Book",500);
		Product Pen = new Product("Pen",30);
		Product Canvas = new Product("Canvas",400);
		Product Notebook = new Product("Notebook",300);
		Product Colour = new Product("WaterColour",450);
		Product Ruler = new Product("Ruler",20);
		Product Eraser = new Product("Eraser",10);
		Product Pencil = new Product("Pencil",15);
		
		List<Product> ProductList = new ArrayList<Product>();
		ProductList.add(Book);
		ProductList.add(Pen);
		ProductList.add(Canvas);
		ProductList.add(Notebook);
		ProductList.add(Colour);
		ProductList.add(Ruler);
		ProductList.add(Eraser);
		ProductList.add(Pencil);
		
		A1.Run(ProductList);
		 	
	}
}	
