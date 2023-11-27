package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	System.out.println("Welcome To XYZ Departmental Store");	
	System.out.println("**********************************");
	
	Scanner s=new Scanner(System.in);
	DepartmentalStore store=new DepartmentalStore();
	
	store.addProduct();
	
	int choice=1;
	while(choice==1) {
	store.displayProduct();
	store.buyProduct();
	System.out.println("----------------------------");
	System.out.println("Press 1 to Continue Shopping");
	System.out.println("or Any Other Number to CheckOut");
	choice =s.nextInt();
	}
	store.checkout();
	}

}
