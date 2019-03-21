/* Author Maximus Mackert,
 * 3/19/2019,
 * I created this class to objects to these constructs and methods to create rectangles
 */
package R;

public class Rectangle {
	double width = 1;
	double height = 1;
	
	Rectangle(){
	}
	
	Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double getArea() {
		double area = width * height;
		return area;
	}
	public double getPerimeter() {
		double perimeter = width * 2 + height * 2;
		return perimeter;
	}
	
}
