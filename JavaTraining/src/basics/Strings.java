package basics;

public class Strings {

	public static void main(String[] args) {
	
	String bookTitle; 
	String wordChoice = "Ring";
	
	bookTitle = "The Lord of the Rings";
	
	if (bookTitle.contains(wordChoice)) {
		System.out.println("The book contains the word" + wordChoice);
	}
	
	String browser = "Chrome";
	if (browser.equalsIgnoreCase("Chrome")) {
		System.out.println("The browser is Chrome");
	}
	
	String firstName = "Tim";
	String lastName = "Short";
	String SSN	=	"249589627";
	
	System.out.println("There are " + SSN.length()+ " digits in the SSN.");
	
	System.out.println(firstName.substring(1, 3));
	System.out.println(lastName.substring(1, 3));
	System.out.println(SSN.substring(5));

	}do {
		System.out.println("Loop");
	} while (1 != 0);
	}
	
}
