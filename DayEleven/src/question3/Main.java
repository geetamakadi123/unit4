package question3;

public class Main {

	public static void main(String[] args) {

        Area obj = new Area();

        int areaOfRectangle=obj.rectangleArea(5,6);

        System.out.println(areaOfRectangle);

        int areaOfSquare=obj.squareArea(5);
        
        System.out.println(areaOfSquare);

        int areaOfCircle=obj.circleArea(4);
        
        System.out.println(areaOfCircle);
    }
	
}
