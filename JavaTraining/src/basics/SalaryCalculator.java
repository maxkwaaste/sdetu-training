package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's create a variable to define our career
		
		// Declare variable
		String career; 
		System.out.println("program is starting");
		career = "Software Developer";
		System.out.println("My career:" + career);
		 
		// Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " is $ " + salary+ " per year");
		
		
		// Compute our anual salary
		// rate *hoursperweek * weeksperyear
	}
}
