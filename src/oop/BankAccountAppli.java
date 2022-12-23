package oop;

public class BankAccountAppli {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("538767234", 1000.50);
		BankAccount acc2 = new BankAccount("562825482", 2000);
		BankAccount acc3 = new BankAccount("233336699", 2500);
		
		
		acc1.setName("Mano");
		System.out.println(acc1.getName());
		acc1.makedeposit(500);
		acc1.makedeposit(600);
		acc1.paybill(1000);
		acc1.accure();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	// Properties of bank account
	private static int iD = 1000;   // Internal ID
	private String accountNumber;  // iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "532875421";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountnumber();	
	}
	
	private void setAccountnumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + 	SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	
	public void paybill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makedeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance = balance + amount; 
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accure() {
		balance= balance * (1 + rate/100);
		showBalance();
	
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" + "[Balance " + balance + "]"; 
		
	}
		
 	
}


