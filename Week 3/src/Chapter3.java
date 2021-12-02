import java.util.Scanner;

/**
 * 
 * @author Nicholas Cercos
 *
 */
public class Chapter3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = input.next();
		
		double balance = 45.5;
		
		String message = String.format("Hello, %s, you have a balance of $%.2f", name, balance);
		
		System.out.println(message);
	}
}
