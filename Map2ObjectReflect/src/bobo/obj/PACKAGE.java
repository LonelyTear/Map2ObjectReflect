package bobo.obj;

import java.util.ArrayList;
import java.util.List;

public class PACKAGE {
	
	public List<VHL> VHL = new ArrayList<VHL>();
	public List<HEAD> HEAD = new ArrayList<HEAD>();

	public PACKAGE(List<VHL> vHL) {
		super();
		VHL = vHL;
	}

	public PACKAGE() {
		super();
	}

	public List<VHL> getVHL() {
		return VHL;
	}

	public void setVHL(List<VHL> vHL) {
		VHL = vHL;
	}

	public List<HEAD> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<HEAD> hEAD) {
		HEAD = hEAD;
	}

	
	
	
	
}
