package question4;

public class Engine {
	
    int rmp;
    int power;
    String manufacturer;
    boolean hasTurbo;

    public boolean hasTurbo() {
        return true;
    }

    public static void main(String[] str) {

        Car c1 = new Car();
        c1.model = "Harrier";
        c1.companyName = "Tata";
        c1.color = "black";
        Engine e = c1.engine;
        e.manufacturer = "Tata";
        e.rmp = 10000;
        e.power = 110;
        e.hasTurbo();
        
        System.out.println("Car Model: " + c1.model);
        System.out.println("Car Company Name: " + c1.companyName);
        System.out.println("Car Color: " + c1.color);
        System.out.println("Car Manufacturer: " + e.manufacturer);
        System.out.println("Car RMP: " + e.rmp);
        System.out.println("Car Power: " + e.power);
        System.out.println("Car Has Turbo: " + e.hasTurbo());


        Engine e1 = new Engine();
        e1.manufacturer = "Maruti";
        e1.rmp = 20000;
        e1.power = 210;
        e1.hasTurbo();
    }
}


