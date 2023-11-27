package com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {
	
	//Kye->product id
	LinkedHashMap<Integer, Product> db=new LinkedHashMap<Integer, Product>();
	Scanner scan=new Scanner(System.in);
	double totalBill= 0;
	
    void addProduct() {
	db.put(1, new Product("chocolates", 10, 5));
	db.put(2, new Product("Biscuites", 20, 10));
	db.put(3, new Product("IceCream", 30, 20));
	}
    void displayProduct() {
	Set<Integer> keys=db.keySet();
	for(int key: keys) {
		Product p=db.get(key);
		System.out.println("Enter "+key+" to order:`` "+p.getName());
		System.out.println("Available Quentity: "+p.getQuantity());
		System.out.println("Product Cost: Rs."+p.getCost());
		System.out.println("------------------------------------");
	}
	
    }
    //getting the product based on choice and return null when key is not present
    void buyProduct() {
	System.out.println("Enter Choice");
	int choice=scan.nextInt();         //1 2 3 choice ->key
	Product p=db.get(choice);
	if(p!=null) {
		System.out.println("Enter Quentity:");
		int quantity =scan.nextInt();
		if(quantity <=p.getQuantity()) {
			
			//current product cost
			 double productCost =quantity *p.getCost();
			//add PC to Total Bill
			totalBill = totalBill + productCost;
			//update the new quentity
			p.setQuantity(p.getQuantity() - quantity);
			System.out.println("Orderd "+quantity+" "+p.getName());
			System.out.println("Product Cost: "+productCost);
			System.out.println("Total Bill as of Now: "+totalBill);
		}
	
		else {
			System.out.println("Invalid Quentity");  //InvalidQuantityException
		}
	}
	else {
		System.out.println("Invalid Choice");   //InvalidChoiceException
	}
    }
    void checkout() {
	System.out.println("Total Bill: Rs."+totalBill);
	System.out.println("Thank You For Shopping!");
    }
    }
