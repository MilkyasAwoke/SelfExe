package supperClass;

public class Student extends Person {
	String major;
	double gpa;
	
	public Student() {
		this.major = "";
		this.gpa = 0;
		System.out.println("Object of Student of class created");
	}
public Student(String major) {
	this();
	this.major = major;
	
	
}
	public Student(String major, double gpa) {
		this.major = major;
		this.gpa = gpa;	
	}	 
	public int sum(int a, int b) {
		return a + b;
		
	}
	@Override
	
	public String toString() {
		return "Student [firstName: " + super.firstName
				+ ", lastName: " + super.lastName + "]";
				
		
	}
	
}
















