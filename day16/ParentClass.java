package day16;

public class ParentClass {
	int parentInt;
	String parentStr;
	
	public ParentClass(int parentInt, String parentStr) {
		this.parentInt = parentInt;
		this.parentStr = parentStr;
	}

	public ParentClass() {
		super();
	}

	
	public ParentClass(int parentInt) {
		super();
		this.parentInt = parentInt;
	}


	
}
