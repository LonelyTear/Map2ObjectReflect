package bobo.obj;

public class VHL {
	public String A;
	public String B;
	public String C;
	public int I;
	public VHL() {
		super();
	}
	
	public VHL(String a, String b, String c) {
		super();
		A = a;
		B = b;
		C = c;
	}

	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	
	public void setDateA(String DateA) {
		
	}
	
	public void setI(String I) {
		this.I = Integer.parseInt(I);
	}
	
	
}