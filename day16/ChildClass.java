package day16;

public class ChildClass extends ParentClass{
	int childVal;
	public ChildClass(int parentInt, String parentStr) {
		super(parentInt, parentStr);
	}

	public ChildClass() {
		super();
	}

	public ChildClass(int parentInt, String parentStr, int childVal) {
		super(parentInt, parentStr);
		this.childVal = childVal;
	}
	public ChildClass(int parentInt, int childVal) {
		super(parentInt);
		this.childVal = childVal;
	}
		
}
