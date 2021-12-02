import java.util.Scanner;

/**
 * 
 * @author Nicholas Cercos
 *
 */
public class Practice {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let's find the sum of numbers from 1 to...");
		System.out.println("(Enter an end value as a double): ");
		double endValue = input.nextDouble();
		double sum = getSumOfNum(endValue);
		System.out.println("Result: " + sum);
		
		System.out.println("Now, let's find the average of numbers from 1 to...");
		System.out.println("(Enter an end value as a double): ");
		endValue = input.nextDouble();
		double avg = findAvg(endValue);
		System.out.println("Result: " + avg);
		
		System.out.println("Goodbye!");
		input.close();
	}

	// The doubles from 1 to end value (num).
	public static double getSumOfNum(double num) {
		double sum = 0;
		for(double i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
	// Find the average of the sum of all numbers between 1 and num.
	public static double findAvg(double num) {
		double sum = getSumOfNum(num);
		return sum / num;
	}
}
