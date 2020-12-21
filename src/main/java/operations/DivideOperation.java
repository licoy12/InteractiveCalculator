package operations;

public class DivideOperation {

	private double a = 0;
	private double b = 0;
	
	public void setA(int input) {
		this.a = input;
	}
	
	public void setB(int input) {
		this.b = input;
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	
	public double getResult() {
		return this.a / this.b;
	}
}
