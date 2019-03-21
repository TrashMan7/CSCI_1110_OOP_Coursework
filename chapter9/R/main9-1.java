/*Author Maximus Mackert,
 * 3/19/2019,
 * I created this class of objects to pass to my rectangle class and then print the size of the objects
 */
package R;

public class Exercise_9_1 {
	public static void main(String[] args) { 
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		Rectangle rec3 = new Rectangle(4, 40);
		System.out.println("The width is " + rec1.width + "\nThe height is " + rec1.height + 
				"\nThe area is " + rec1.getArea() + "\nThe Perimeter is " + rec1.getPerimeter());
		System.out.println();
		System.out.println("The width is " + rec2.width + "\nThe height is " + rec2.height + 
				"\nThe area is " + rec2.getArea() + "\nThe Perimeter is " + rec2.getPerimeter());
		System.out.println();
		System.out.println("The width is " + rec3.width + "\nThe height is " + rec3.height + 
				"\nThe area is " + rec3.getArea() + "\nThe Perimeter is " + rec3.getPerimeter());
	}
}
