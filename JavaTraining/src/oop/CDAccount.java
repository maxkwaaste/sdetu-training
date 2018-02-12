package oop;

public class CDAccount extends bankaccount implements IRate{

	String interestRate;
	
	void compound()  {
		System.out.println("Compounding interest");
	}
	
}

