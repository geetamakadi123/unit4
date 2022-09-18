
//Q4) Define a Java class Parent with the following 3 methods:
//method1(): void
//method2(): void
//method3(): void
//
//And the following Final filed:
//number: integer
//
//Make sure that method1() must be overridden inside the child class.Make sure that method2() can
//not be overridden inside the child class.
//
//The method3() may or may not be overridden inside the child class.
//Define method4() method inside the child class.
//
//Make sure nobody can extend the child class.
//
//While creating the child class object of the above class, take a positive number from
//the user between the range of 1 to 10, and initialize the value of the number variable of the parent class otherwise print “Invalid number”.From method1() print the value of the
//number variable.
//
//Call method1(), method2(), method3() and method4() from the parent class variable.
//
//Note: Inside each method body mention this method belongs to which class

package question4;


import java.util.Scanner;

final public class Child extends Parent{

    @Override
    void method1() {

        System.out.println("input number by user is : "+number);
       super.method1();
    }

    @Override
    void method3() {
        System.out.println("inside overridden method3 of parent class");
        super.method3();
    }

    void method4(){
        System.out.println("inside child class method4");
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int Num= input.nextInt();

        if(Num>=1 && Num<=10){
            Parent obj=new Child();

            obj.number=Num;
            obj.method1();
            obj.method3();

             Child c1=(Child) obj;

             c1.method4();

        }

        else{
            System.out.println("Invalid Number");
        }



    }
}


