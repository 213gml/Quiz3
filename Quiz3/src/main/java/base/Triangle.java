package base;

//Garrett LaCurts

public class Triangle extends GeometricObject {
	
	private double side1, side2, side3 = 1.0;
	
	public Triangle() {
		
	}
	
	/**
	 * Creates a new Triangle object with 3 specified side lengths,
	 * default length is 1.0
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3){
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	/**
	 * Returns the area (double) of Triangle t
	 */
	public double getArea(Triangle t) {
	
		
		double halfPerimeter = (t.getSide1() + t.getSide2() + t.getSide3()) / 2;
		double Area = Math.sqrt((halfPerimeter)*(halfPerimeter - t.getSide1())*
			          (halfPerimeter - t.getSide2())*(halfPerimeter - t.getSide3()));
		return Area;
	}

	/**
	 * Returns the perimeter (double) of Triangle t
	 */
	public double getPerimeter(Triangle t) {
		
		double Perimeter = t.getSide1() + t.getSide2() + t.getSide3();
		return Perimeter;
	}
	
	/**
	 * Returns a description of the created Triangle object
	 * 
	 * @param t
	 * @return
	 */
	public String ToString(Triangle t) {
		
		return "Area: " + getArea(t) + "\nPerimeter: " + getPerimeter(t);
	}

	public double getArea() {
		return 0;
	}

	public double getPerimeter() {
		return 0;
	}

	

}
