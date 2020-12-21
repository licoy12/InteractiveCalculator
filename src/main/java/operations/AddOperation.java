package operations;

final public class AddOperation {
	
	private int a = 0;
	private int b = 0;
	
	public void setA(int input) {
		this.a = input;
	}
	
	public void setB(int input) {
		this.b = input;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public int getResult() {
		return this.a + this.b;
	}

}
