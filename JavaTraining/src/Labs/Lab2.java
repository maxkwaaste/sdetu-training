package Labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Sabrina","5441513");
		Student stu2 = new Student("Max","4161345");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
		

	} 
}
class Student {
	// Properties
	private static int ID=1000;
	private String UserID;
	private String name;
	private String ssn;
	private String email;
	public 	String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	private String city;
	private String phone;
	private String state;
	
	

	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	// what happens when new student gets created
	public Student(String name, String ssn)  {
		ID++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	private void setEmail() {
		email = name.toLowerCase() + "." + ID + "@student.hu.nl";
		System.out.println("your email: " + email);
	}
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max-min));
		randNum = randNum + min;
		UserID = ID + "" + randNum + ssn.substring(5);
		System.out.println("Your user ID: " + UserID);
	}
	public void enroll(String course)  {
		this.courses = this.courses + "\n" + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
		
	} 
	public void checkBalance()  {
		System.out.println("Balance: $" + balance);
		
	}
	public void payTuition(int amount)  {
		balance = balance - amount;
		System.out.println("Payment: $"+ amount);
	}

	public String toString()  {
		return "[NAME: " + name + "]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + " ]";  
		
	}
	public void showCourses()  {
		System.out.println(courses);
	}
}
	

