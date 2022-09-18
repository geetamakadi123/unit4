package question1;

public interface X {
	
    void absX();
    
    default void defX(){
        System.out.println("X of default");
    }
    public  static void staX(){
        System.out.println("X of static");
    }


}
