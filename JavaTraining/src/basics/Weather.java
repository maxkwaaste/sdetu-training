package basics;

public class Weather {
	public static void main (String[] args)   {
		// This program will give suggestions on what to wear based on the weather (temperature).
		
		int temperature = 51;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
	}
		else if ((temperature > 60) && (sunCondition == "Sunny"))  {
			System.out.println("It's a little cooler. Perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat to block the sun");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast"))	{
			System.out.println("This is a cool day, make sure to wear warm clothes");
		}
		else {
			System.out.println("Looks like a cold day, bring a sweater and jacket");
		}
		System.out.println("The program is ending");
	}
}