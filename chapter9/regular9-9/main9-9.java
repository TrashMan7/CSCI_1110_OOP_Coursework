/*Maximus Mackert,
 * 3/21/2019,
 * This is main class creates two objects and prints their area and perimeter
 */
public class main {

	public static void main(String[] args) {
		RegularPolygon shape1 = new RegularPolygon(6, 4);
		RegularPolygon shape2 = new RegularPolygon(10, 4, 5.6,7.8);
		System.out.println("The Perimeter of shape 1 is " + shape1.getPerimeter(0));
		System.out.println("The Area for shape 1 is " + shape1.getArea(0));
		System.out.println("The Perimeter of shape 2 is " + shape2.getPerimeter(0));
		System.out.println("The Area of shape 2 is " + shape2.getArea(0));
	}

}
