package students;

public class Student {
	
		
		int roll;
		
		String name;
		
		int marks;
		
		void displayStudentDetails() {
			System.out.println("name of student" +name);
			System.out.println("roll of student" +roll);
			System.out.println("mark of student" +marks);
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Student Student1=new Student();
			Student Student2=new Student();
			
			Student1.name="Gitanjali Makadi";
			Student1.roll=1118;
			Student1.marks=97;
			Student1.displayStudentDetails();
			
			Student2.name="Geeta Makadi";
			Student2.roll=1245;
			Student2.marks=187;
		//	Student1=Student2;//student1 object is removed by garbage collection 
			Student2.displayStudentDetails();
			

}



}
