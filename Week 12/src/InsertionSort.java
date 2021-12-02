import java.util.Arrays;

/**
 *
 * @author Nicholas Cercos
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = {5, 2, 12, 12, 1, 3, 9, 6, 4, 19, 16};
		sortInsertion(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	public static void sortInsertion(int[] numbers) {

		// Loop through the array, starting from the second number in the array to avoid being out of bounds.
		for(int i = 1; i < numbers.length; i++) {
			int num = numbers[i];
			int prevNum = numbers[i - 1];

			// Check if the number at the current index is less than the number at the index below.
			if(num < prevNum) {
				// If so, swap positions. (Insert new & old numbers at their new respective indexes).
				numbers[i - 1] = num;
				numbers[i] = prevNum;

				// Create a while loop that continues this swap throughout the array to move smaller numbers towards
				// the beginning to this array.
				int sortIndex = (i - 1);
				while(sortIndex >= 0) {
					if((sortIndex - 1) < 0)break;
					num = numbers[sortIndex];
					prevNum = numbers[sortIndex - 1];
					if(num < prevNum) {
						numbers[sortIndex - 1] = num;
						numbers[sortIndex] = prevNum;
					} else break;
					sortIndex--;
				}

				// Check the first two numbers again, and swap them if needed.
				num = numbers[1];
				prevNum = numbers[0];
				if(num < prevNum) {
					numbers[0] = num;
					numbers[1] = prevNum;
				}
			}
		}
	}

}
