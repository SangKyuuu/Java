package test4.sub1;

public class Main {

	public static void main(String[] args) {
		StudentScore s = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		s.printStudentInfo();
		System.out.println("-------------------");
		
		s.updateScore(98.0);
		System.out.println("-------------------");
		
		s.updateScore(102.0);
		System.out.println("-------------------");
		
		s.printStudentInfo();
		System.out.println("-------------------"); 
		
	}

}
