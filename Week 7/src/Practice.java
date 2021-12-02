/**
 *
 * @author Nicholas Cercos
 *
 */
public class Practice {

	public static void main(String[] args) {
		// Test findAvg method
		int[] numbers = {12, 23, 509, 327, 19, 20, 21};
		double average = findAvg(numbers);
		System.out.println("The average of the numbers in the array is " + average);
	}

	// Calculate the average of all numbers
	public static double findAvg(int[] nums) {
		double sum = 0;
		double length = nums.length;
		for(int i = 0; i < length; i++) {
			sum += nums[i];
		}
		return sum / length;
	}
}
