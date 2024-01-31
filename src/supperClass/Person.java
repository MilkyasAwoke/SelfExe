package supperClass;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
				
	}
	public Person(String firstName,String lastName, int age) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
