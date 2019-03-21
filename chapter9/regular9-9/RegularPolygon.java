/*Maximus Mackert,
 * 3/21/2019,
 * This class has constructs for polygon objects and accessors and mutators for all of
 * their variables. Also it has accessors for their perimeter and area
 */
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x, y;
	RegularPolygon(){
		
	}
	RegularPolygon(int N, double Side){
		n = N;
		side = Side;
	}
	RegularPolygon(int N, double Side, double X, double Y){
		n = N;
		side = Side;
		x = X;
		y = Y;
	}
	public int getN(int N){
		return N;
		
	}
	public void setN(int N){
		
	}
	public double getSide(double Side){
		return Side;
		
	}
	public void setSide(double Side){
		
	}
	public double getX(double X){
		return X;
		
	}
	public void setX(double X){
		
	}
	public double getY(double Y){
		return Y;
		
	}
	public void setY(double Y){
		
	}
	public double getPerimeter(double Perimeter){
		Perimeter = side * n;
		return Perimeter;
		
	}
	public double getArea(double Area){
		Area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		return Area;
		
	}
}
