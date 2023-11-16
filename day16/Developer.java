package day16;

public class Developer extends Person{
	
	public void myJob() {
		System.out.println("나는 Developer입니다.");
	}
	public Developer() {
		
	}
	
	String langType;
	String company;
	
	public Developer(String name, int age, String addr,
			         String langType, String company) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.langType = langType;
		this.company = company;
	}
	
	
}
