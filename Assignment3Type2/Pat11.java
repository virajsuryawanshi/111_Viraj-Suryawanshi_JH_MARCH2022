class Pat11 {
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {             
			
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