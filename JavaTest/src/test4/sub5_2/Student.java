package test4.sub5_2;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject sub) {
		System.out.println(name + " - " + sub.getSubName() + "과목 신청완료");
		sub.addStudent(this);
	}
	
	public void setScore(Subject sub, int score) {
		System.out.println(name + " - " + sub.getSubName() + "점수 입력완료");
		subjects[subjectCount] = sub;
		scores[subjectCount] = score;
		subjectCount++;
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		
		for(int i=0; i < subjectCount; i++) {
			System.out.println(" - " + subjects[i].getSubName() + ":" + scores[i]);
		}
		
	}
	
	public String getName() {
		return name;
	}
	
}
