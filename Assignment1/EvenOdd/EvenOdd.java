import java.util.Scanner;

class EvenOdd {

	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		if (number % 2 == 0) 
			System.out.println("Number " + number + " is an EVEN number.");
		else
			System.out.println("Number " + number + " is an ODD number.");
		
	}

}