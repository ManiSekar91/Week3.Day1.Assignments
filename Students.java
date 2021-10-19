package week3.day1.assigments;

public class Students {
	public void getStudentInfo(int ID) {
		System.out.println("The student ID is:" + ID);
	}
	public void getStudentInfo(int ID, String Name) {
		System.out.println("Student name is:" + Name);
	}
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Email ID and Phone Number is: " + email + phoneNumber);
	}

	public static void main(String[] args) {
Students a = new Students();
a.getStudentInfo(58745);
a.getStudentInfo(58745, "Manikandan");
a.getStudentInfo("manimani@gmail.com", "5874687120");
	}

}
