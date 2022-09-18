package question3;

import java.util.TreeSet;

public class Main {
	
public static void main(String[] args) {
		
		TreeSet<Student> t=new TreeSet<>();
		t.add(new Student(1,"t1",10,20,1));
		t.add(new Student(2,"t2",12,13,11));
		t.add(new Student(3,"t3",4,25,30));
		t.add(new Student(4,"t4",14,25,30));
		t.add(new Student(5,"t5",15,23,12));
		
		System.out.println(t);
		System.out.println(t.size());
 	}

}
