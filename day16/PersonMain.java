package day16;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "양기두";
		person.age = 38;
		person.addr = "인천";
		Student stu = new Student( );
		stu.name = "양기두";
		stu.age = 38;
		stu.addr = "인천";
		stu.univName ="인하";
		stu.major = "인천";
//		stu.myJob();
		
		Developer dev = new Developer("양기두",38,"인천", "JAVA","ICIA");
//		dev.myJob();
		
		PersonService psvc = new PersonService();
		psvc.choiceType(dev);

		Person personDEV = new Developer();
		
		Person personSTU = new Student();
		Student stuPerson = new Person();
	}

}













