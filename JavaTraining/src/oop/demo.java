package oop;

class person {

	String name;
	String email;
	String phone;
	
	void wak() { 
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() :
		System.out.println(name + "is sleeping");
}
	
	public class Demo {
		
		public static void main(String[] args)  {
			Person person1 = new Person();
			
			person1.name = "Joe";
			person1.email = "joe@testnet.com";
			person1.phone = "23095823";
			
			person1.walk();
			
			Person person2 = new Person();
			
			
		}
		
		
		
		
}
}