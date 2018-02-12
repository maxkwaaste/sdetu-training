package oop;

public class bankaccount implements IRate{
	//Define variables
	String accountnumber;
	
	//static >> belongs to the CLASS not the object instance
	//final >> constant (often static final)
	private static final String routingnumber = "29486";
	
	// instance variables
	private String name;

	private String ssn;
	String accounttype;
	double balance = 0;
	
	
	/* Constructor definitions: unique methods
	 * 1. They are used to define / setup / initialise properties of an object
	 * 2. Constructors are IMPLICITLY called upon INSTANTIATION
	 * 3. The same name as the class itself
	 * 4. Constructors have NO return type
	 */
	bankaccount() {
		System.out.println("NEW ACCOUNT CREATED");	
	}
	
	//Overloading: Call the same method with different arguments
	bankaccount(String accounttype)  {
		System.out.println("NEW ACCOUNT CREATED: "+ accounttype);
	}
	
	bankaccount(String accounttype, double initdeposit)  {
		System.out.println("NEW ACCOUNT: " + accounttype);
		System.out.println("INITIAL DEPOSIT OF: $" + initdeposit);
		String Msg = "";
		if (initdeposit < 1000)  {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		}	else {
			Msg = "Thanks for your inital deposit of: " + initdeposit;
			}
				System.out.println(Msg);
				balance = initdeposit;
		}
	
	// Getters / Setters
	
	// Allow the user to define the name
	
	public void setName(String name)  {
		this.name = name; 
		
	}
	public String getName() {
		
		 return name;
	}
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface methods


		public void setRate()  {
			System.out.println("SETTING RATE");
		}
		public void increaseRate()  {
			System.out.println("INCREASING RATE");
		}
	

	void deposit()  {
		
		
	}
	
	void withdraw()  {
		
		
	}
	
	private showActivity() {
	System.out.println("Showing recent activity");	
	}
	
	void checkbalance()	{
		System.out.println("balance: " + balance);
		
	}
	void getStatus() {
		
		
	}
	@Override
	public String toString() {
		return "[ " + name + ". " + accountnumber + ". Balance: $" + balance + "]";
	}
	
	}

