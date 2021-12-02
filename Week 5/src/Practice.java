import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a given power: ");
		int p = scanner.nextInt();
		
		System.out.println("Enter a range minimum: ");
		int n = scanner.nextInt();
		
		System.out.print("Enter a range maximum: ");
		int m = scanner.nextInt();
		
		int counter = n;
		while(counter <= m) {
			System.out.println(counter + " to the power of " + p + " is " + (int)Math.pow(p, counter));
			counter++;
		}
		scanner.close();
	}

}
