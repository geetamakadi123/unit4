package questionThree;

public class Student {
	int roll;
    String name;
    String address;
    String collageName;

    Student(int roll,String name,String address){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.collageName="NIT";


    }
    Student(int roll,String name,String address,String collageName){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.collageName=collageName;
    }
    public static Student getStudent(boolean isFromNIT) {
        if(isFromNIT==true) {
            Student student=new Student(21,"Lokesh","Bhiwapur");
            return student;
        }else {
            Student student=new Student(18,"Gayatri","Dist-Nagpur,Tah-Bhiwapur","GMC(Government Medical College Nagpur");
            return student;
        }

    }

   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student stundent=getStudent(false);
	        System.out.println("Roll no          :-"+" "+stundent.roll);
	        System.out.println("Name             :-"+" "+stundent.name);
	        System.out.println("Address          :-"+" "+stundent.address);
	        System.out.println("Collage Name     :-"+" "+stundent.collageName);

	}

}
