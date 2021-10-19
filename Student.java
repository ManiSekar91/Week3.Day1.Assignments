package week3.day1.assigments;

public class Student {

	public void studentName() {
		System.out.println("Student Name is Manikandan");
	}
	
	public void studentDept() {
		System.out.println("Student Department is MCA");
	}
	public void studentId(){
		System.out.println("Student ID is 2546");
	}
	
	public static void main(String[] args) {
College a = new College();
a.collegeName();
a.collegeCode();
a.collegeRank();

Department b = new Department();
b.deptName();

Student c = new Student();
c.studentName();
c.studentId();
c.studentDept();
	}

}
