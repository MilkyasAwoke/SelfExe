package supperClass;

public class Runner {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.major = "Test";
		Student obj1 = new Student();
		obj1.age = 23;
		
		
		System.out.println(obj.major);
		System.out.println(obj1.age);
		System.out.println(obj);
		System.out.println(obj1);
	}
	}


