package questionOne;

public class Javabeen {
	 public static void main(String[] args) {
	        
	        //using zero argument constructor
	        Student student1 = new Student();
	        student1.setRoll(97);
	        student1.setName("Krishna");
	        student1.setAge(29);
	        student1.setMarks(550);


	        Student student2 = new Student(1, "Satish",28, 450);
	        System.out.println("Student1 details: ");

	        student1.showDetails();
	        System.out.println("Student2 details using getter methods");
	        System.out.println("Roll is :"+student2.getRoll());
	        System.out.println("Name is :"+student2.getName());
	        System.out.println("Age is :"+student2.getAge());
	        System.out.println("Marks is :"+student2.getMarks());
	    }
}
