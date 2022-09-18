package question2;

public class Main {
	
	public static void main(String[] args) {
        
        Dog dog=new Dog();
        Cat cat=new Cat();
        Tiger tiger=new Tiger();
        //initialize all 3 elements of this Animal class with
        //Dog, Cat and Tiger class object.
        Animal[] arr= {dog,cat,tiger};
        //call the all methods (eat,walk,makeNoise) from all
        //the 3 objects.
        for(int i=0; i<arr.length; i++) {

            arr[i].eat();
            arr[i].walk();
            arr[i].makeNoise();

            System.out.println("====================");
        }
 }
}
