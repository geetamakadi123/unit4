package question1;

public class Main {

	  Object[] changeArray(Object arr[]) {
	      
	
		  Object[] narr= new Object[4];

		  
		  for(int i=0;i<arr.length;i++) {
			  
	    	   if(arr[i] instanceof Student) {
					  Student s=(Student)arr[i];
					 narr[i]=new Student(23, "rakesh",s.getMarks()+10 );
//					 System.out.println(narr[i]);
			     }
				  
				  else  if(arr[i] instanceof Employee) {
					  Employee e=(Employee)arr[i];
					  narr[i]=new  Employee(12, "Lokesh",e.getSalary()+10000);
				  }
				  else if(arr[i] instanceof String) {
					  String str="";
					  
					  String stri= (String)arr[i];
					  
					  for(int j=stri.length()-1;j>=0;j--) {
						  str+=stri.charAt(j);  
					  }
					  narr[i]=str;
				  }
				  else {
					  int num= (int)arr[i];
					  int nnum=num +20;
					  narr[i]=nnum;
//					  System.out.println(narr[i]);
				  }
			  
			   }
//		  System.out.println(narr[3]);
		  return narr;
	  }

	
 
      public static void main(String[] args) {
      
       Object[] obj= new Object[]{new Student(23, "rakesh", 460),new Employee(12, "Lokesh",	94000),"String",70};
       
       Main m1= new Main();

       Object arr[]=m1.changeArray(obj);
//       System.out.println();
       for(var i=0;i<obj.length;i++) {
    	   if(arr[i] instanceof Student) {
				  Student s=(Student)arr[i];
				  System.out.println("Student [roll = "+s.getRoll()+", name = "+s.getName()+", salary = "+s.getMarks()+".0]");

		     }
			  
			  else  if(arr[i] instanceof Employee) {
				  Employee e=(Employee)arr[i];
				 System.out.println("Employee [id = "+e.getId()+", name = "+e.getName()+", salary = "+e.getSalary()+".0]");

				  
			  }
			  else if(arr[i] instanceof String) {
				  
				  
				  String stri= (String)arr[i];
				  System.out.println(stri);
				 
			  }
			  else {
				  int num= (int)arr[i];
				  System.out.println(num);
			  }
		
          }
       }
}
