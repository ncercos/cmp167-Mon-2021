import java.util.Scanner;

/**
 * 
 * @author Nicholas Cercos
 *
 */
public class Practice {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the hotel! What is your name?");
		String name = scanner.nextLine();
		
		double costs = 85.97;
		
		System.out.printf("After checking your reservation, %s, you must pay $%.2f a night to stay at this hotel.", name, costs);
		scanner.close();
	}
}
