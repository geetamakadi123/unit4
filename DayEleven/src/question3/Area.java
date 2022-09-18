package question3;

public class Area extends Shape{
	
	 public int rectangleArea(int length, int breadth){


	        int area=length * breadth;

	        return area;
	    }

	    public int squareArea(int side){
	    	
	        int area=side * side;

	        return area;
	    }
	    public int circleArea(int radius){

	        int area= (int) (Math.PI * (radius * radius));

	        return area;
	    }

}
