class Pat6 {
	
	public static void main(String args []) {		
		
		for (int rows = 4; rows >= 1 ; rows--) {                // Upper Pyramid
			
			for (int spaces = rows; spaces < 4; spaces++) {
				
				System.out.print(" ");
				
			}
			
			for (int column = rows ; column > 1; column--){
				
				System.out.print("*");
				
			}
			
			for (int column = rows; column >= 1; column--){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}														// ending the second Pyramid
		
		
	}	
	
}