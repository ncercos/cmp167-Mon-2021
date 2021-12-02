import java.util.Scanner;

public class Chapter4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Nick's Bar!");
		System.out.println("I have beer, wine, water, what do you want?");
		int age;
		String userSelection = input.nextLine();
		
		if(userSelection.equalsIgnoreCase("beer") || userSelection.equalsIgnoreCase("wine")) {
			System.out.println("Can you enter your age: ");
			age = input.nextInt();
			if(age >= 21) {
				if(userSelection.equalsIgnoreCase("beer")) {
					System.out.println("Here is your beer, sir");
				} else {
					System.out.println("Here is your wine, sir");
				}
			} else {
				System.out.println("Sorry you cannot have alcohol");
			}
		} else if(userSelection.equalsIgnoreCase("water")) {
			System.out.println("Here is your water, sir");
		} else {
			System.out.println("Sorry, you have to choose something from the menu!");
		}
		input.close();
	}

}
