package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaserate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		
		//Polymorphism changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.increaserate();
		account1.setRate();

	}

}
