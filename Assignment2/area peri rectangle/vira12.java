import java.util.Scanner;

class vira12
{
	public static void main(String args[])
	{
		float height, width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the height of rectangle: ");
		height = input.nextFloat();
		
		System.out.println("Enter the width of rectangle: ");
		width = input.nextFloat();
			
		System.out.println("Area of Rectangle is " + (height * width));
		System.out.println("Area of Rectangle is " + (2 * (height + width)));
	
	}
}





