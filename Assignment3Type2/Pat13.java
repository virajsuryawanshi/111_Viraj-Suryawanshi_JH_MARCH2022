class Pat13 {
	
	public static void main(String args []) {
		
		for (int rows = 0; rows < 5; rows++) {
			
			for (int spaces = 0; spaces < rows; spaces++) {
				
				System.out.print(" ");
				
			}
			
			for (int column = 5 - rows; column >= 1; column--){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		for (int rows = 2; rows <= 5; rows++) {
			
			for (int space = 5 - rows; space >= 1; space--){
				
				System.out.print(" ");
				
			}
			
			for (int column = 1; column <= rows; column++){
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
			
		}				
		
	}	