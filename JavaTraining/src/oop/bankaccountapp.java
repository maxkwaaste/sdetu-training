package oop;

public class bankaccountapp {
	
	public static void main(String[] args) {
		
		
		bankaccount acc1 = new bankaccount();
		
		//acc1.name	=	"Roger Hue";
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("53676357");
		acc1.accountnumber = "0123456";
		acc1.balance	=	10000;
		acc1.setRate();
		acc1.increaseRate();
		
		System.out.println("SSN " + acc1.getSsn());


		
		System.out.println(acc1.toString());
		
	}

}
