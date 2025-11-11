package com.codegnan.Overload;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	
	public Product(int productId, String productName, double price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(int productId, String productName) {
		this(productId, productName, 0.0, 1);
	}

	public void updateQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void updateQuantity(int quantity, boolean add) {
		if(add)
			this.quantity += quantity;
		else
			this.quantity = quantity;
	}
	
	public void addStock(int qty) {
		if(qty > 0) {
			this.quantity += qty;
            System.out.println(qty + " units added to stock.");
		} else {
            System.out.println("Invalid quantity to add.");
		}
	}
	
	public void removeStock(int qty) {
		if(qty > 0 && qty <=this.quantity) {
			this.quantity -= qty;
            System.out.println(qty + " units removed from stock.");
		} else {
            System.out.println("Insufficient stock or invalid quantity.");
		}
	}
	
	public double getDiscountPercent() {
		if(quantity >=6)
			return 15.0;
		else if(quantity >= 3) 
			return 10.0;
		else 
			return 5.0;
	}

	public double getTotalCost() {
		return price * quantity;
	}
	
	public double getDiscountAmount() {
		return  (getTotalCost() * getDiscountPercent())/100;
	}
	
	public double getFinalPrice() {
		return getTotalCost() - getDiscountAmount();
	}
	
	public void printProductDetails() {
        System.out.println("--------------------------------------------------");
        System.out.println("Product ID       : " + productId);
        System.out.println("Product Name     : " + productName);
        System.out.println("Price per Unit   : ₹" + price);
        System.out.println("Quantity in Stock: " + quantity);
        System.out.println("Discount Applied : " + getDiscountPercent() + "%");
        System.out.println("Discount Amount  : ₹" + getDiscountAmount());
        System.out.println("Final Price      : ₹" + getFinalPrice());
        System.out.println("--------------------------------------------------");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(101, "Wireless Mouse", 800.0, 5);
		Product p2 = new Product(102, "Mechanical Keyboard");
		
		    p1.addStock(2);           // Adds 2 units
	        p1.removeStock(1);        // Removes 1 unit
	        p1.updateQuantity(10, false);
	        p2.updateQuantity(3, true);
	        
	        p1.printProductDetails();
	        p2.printProductDetails();
	}

}
