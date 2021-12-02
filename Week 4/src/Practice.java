import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the name of the student? ");
		String name = scanner.nextLine();
		
		System.out.println("What is " + name + "'s final grade? ");
		int grade = scanner.nextInt();
		
		if(grade >= 65) {
			System.out.println(name + " has passed!");
		} else {
			System.out.println(name + " has failed!");
		}
		
		scanner.close();
	}

}
