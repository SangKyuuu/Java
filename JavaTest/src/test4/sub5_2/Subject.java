package test4.sub5_2;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student std) {
		students[studentCount] = std;
		studentCount++;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		for(int i=0; i<studentCount;i++) {
			System.out.print(students[i].getName() + ", ");
		}
		System.out.println();
	}
	
	public String getSubName() {
		return subName;
	}
	
	
}
