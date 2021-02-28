package Lawn;

public class CircleNoInformationHiding {
	public double radius;
	//what is static
	//what is final
	public static final double PI=3.14;
	public double circumfrence() {
		return PI*radius*2;
	}
	public double area() {
		return PI*Math.pow(radius, 2);
	}
}
