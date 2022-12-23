package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = " The lord of the Rings";
		
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice );
		}
		
		String browser = "Chrome";
		//(browser == "chrome")
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Mano";
		String lastName = "Behera";
		String SSN = "7978620525";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN." );
		
		//print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.print(SSN.substring(5));
				

	}

}
