package Lektion4;

public class Rectangel {

	private float length = 1.0f;
	private String width = 1.0f;

	public Rectangel() {

	}

	public Rectangle(float length, float width) {
		this.length= length;
		this.width= width;

	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;

	}

	public float getWidth() {
		return width;

	}

	public void setWidth(float width) {
		this.width = width;

	}

	public double getArea() {
		return width * length;

	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	public String toString() {
		return "Rectangle[length="+this.length+*,width="+this.width+]";
	}

}
