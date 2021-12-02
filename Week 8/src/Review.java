import java.util.Scanner;

public class Review {
	
	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an abbreviation to translate:");
		translate(scanner.next().trim());
		scanner.close();
		*/
		//System.out.println(replaceLast("Thick", 'c'));
		//System.out.println(productAll(5, 10));
		/*
		Scanner scnr = new Scanner(System.in);
		int x = scnr.nextInt();
		int sum = 0;
		int currValue;
		for (int i = 0; i < x; ++i) {
		 currValue = scnr.nextInt();
		 sum += currValue;
		}
		System.out.println(sum);
		*/
		
		double x = 9.0;
		double y = 4.0;
		y = Math.pow(Math.sqrt(x), Math.sqrt(y));

		System.out.println(y);
	}
	
	// Insert an abbreviation and get the meaning.
	public static void translate(String abbv) {
		String meaning;
		if(abbv.equalsIgnoreCase("LOL"))meaning = "Laughing Out Loud";
		else if(abbv.equalsIgnoreCase("Apt"))meaning = "Apartment";
		else if(abbv.equalsIgnoreCase("Ave"))meaning = "Avenue";
		else if(abbv.equalsIgnoreCase("St"))meaning = "Street";
		else if(abbv.equalsIgnoreCase("yolo"))meaning = "You Only Live Once";
		else meaning = "Unknown abbreviation!";
		System.out.println(meaning);
	}
	
	// Replace the last letter in a string with the letter c.
	public static String replaceLast(String s, char c) {
		return s.substring(0, s.length() - 1) + c;
	}
	
	// Find the product of all numbers between a & b inclusive.
	public static int productAll(int a, int b) {
		int product = 1;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		for(int i = min; i <= max; i++) {
			product *= i;
		}
		return product;
	}

}
