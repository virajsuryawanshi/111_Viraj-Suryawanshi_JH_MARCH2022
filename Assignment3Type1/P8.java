class P8 {
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {
			
			for (int space = 5 - rows; space > 0; space--)
				
				System.out.print(" ");
			
			for (int column = 6 - rows; column <= 5; column++){
				
				System.out.print(column + " ");
				
			}
			
			System.out.println();
			
		}
		
	}	
	
}