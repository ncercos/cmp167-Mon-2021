/**
 * 
 * @author Nicholas Cercos
 *
 */
public class Chapter5 {
	
	public static void main(String[] args) {
		/*
		int n = 1;
		while(n < 1000) {
			System.out.println(n);
			n = n * 3;
		}
		*/
		
		// Write a code to check if number is odd or even from 1 to m
		int m = 10;
		int counter = 1;
		while (counter <= m) {
			if(counter % 2 == 0) {
				System.out.println(counter + " is even");
			} else System.out.println(counter + " is odd");
			counter++;
		}
	}

}
