package week3.day1.assigments;

public class Compare {

	public static void main(String[] args) {
				String a = "I am Learning Java"; 
				String b = "I am learning java?";  
				if (a == b) {
					System.out.println("The String is Same");
					
				}
				if (a.equals(b)) {
					System.out.println("The String is Same");
				}
					if (a.equalsIgnoreCase(b)) {
						System.out.println("The String is Same");
					} else {
						System.out.println("The String is Diff");
					}
				}
	}


