class Pat8 {
	
	public static void main(String args []) {
		
		for (int rows = 5; rows >= 1; rows--) {                // Upper Pyramid
			
			for (int spaces = 0; spaces < rows + 1; spaces++) {
				
				System.out.print(" ");
				
			}
			
			for (int column = 5 - rows; column >= 1; column--){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}														// endint the first Pyramid
		
		
		for (int rows = 5; rows >= 1 ; rows--) {                // Lower Pyramid
			
			for (int spaces = rows - 2; spaces < 5; spaces++) {
				
				System.out.print(" ");
				
			}
			
			for (int column = rows; column >= 1; column--){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}														// ending the second Pyramid
		
		
	}	
	
}