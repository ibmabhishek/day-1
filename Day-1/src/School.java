
public class School {

	public static void main(String[] args) {

		printPattern();
		

	}

	private static void printPattern() {
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

	void practice() {
		// for loop 10 teacher object
		for (int i = 0; i < 10; i++) {
			Teacher teacher = new Teacher("Shyam" + i);

		}

		// while loop, do-while
//				int i=0;
//				while(i<10) {
//					System.out.println(i);
//				}

	}

	void studentDiscussion() {
		System.out.println("Hello !!");
		Student student = new Student("Ram"); // Here we are calling default constructor
		// student.name = "Ram"; //avoid as it can cause misuse

		student.setAge((byte) 10);

		// Using Getter and Setter
		// student.setName(" ");
		System.out.println("Name is " + student.getName());

		System.out.println("Age is " + student.getAge());

		student.study();
	}

}
