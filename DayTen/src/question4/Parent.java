package question4;

public class Parent {
	
	void method1(){
        System.out.println("inside Parent class method1");
        method2();
    }
    private void method2(){
        System.out.println("inside Parent class method2");
    }

    void method3(){
        System.out.println("inside Parent class method3");
    }
    int number;



}
