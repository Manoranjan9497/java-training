package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Cteating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Mano Dam";
		// with Encapsulation:public API method
		
		acc1.setName("Mano Dam");
		System.out.println(acc1.getName());
		acc1.setSsn("2345678");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "3425967890";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
	    // Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "34259678";
		
		
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "34259678";
		
		
		/*
		acc3.checkBalance();
		
		
		
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = "4.5";
		cd1.name = "Shyam";
		cd1.balance = 3000;
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/

	}

}
