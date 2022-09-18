
//Q3) We have to calculate the area of a rectangle, a square and a circle.
//Create an abstract class 'Shape' with three abstract methods
//public int rectangleArea(int length, int breadth);
//public int squareArea(int side);
//public int circleArea(int radius);
//Now create another class 'Area' which extends this Shape class and contains all the three methods
//'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle
//respectively.
//Inside the main method of Main class, create an object of class 'Area' and call all the three
//methods.


package question3;

public abstract class Shape {
	
	    public abstract int rectangleArea(int length, int breadth);
	    public abstract int squareArea(int side);
	    public abstract int circleArea(int radius);

}
