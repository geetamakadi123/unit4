package question1;

public class Main {
	
	public static void main(String[] args) {

        Student student1=new Student();
        Instructor instructor1=new Instructor();
        Person newStudent=generatePerson(student1);
        Person newInstructor=generatePerson(instructor1);
        System.out.println(newStudent);
        System.out.println(newInstructor);
    }

    public static Person generatePerson(Person person)
    {
        if(person instanceof Student)
        {
            return new Student(1,"JA111",300000,"Geeta","Chennai","TN","60001");
        }
        else if(person instanceof Instructor)
        {
            return new Instructor(456,45612,"Ratan","Chennai","TN","60001");
        }
        return null;
	
}

}
