
class Pat10 {
	
	public static void main(String args []) {
		
		for (int rows = 5; rows >= 1; rows--) {             
			
			for (int spaces = 1; spaces < rows; spaces++) {
				
				System.out.print(" ");
				
			}
			
			for (int column = 1 ; column <= 5; column++){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}				
		
	}	
	
}