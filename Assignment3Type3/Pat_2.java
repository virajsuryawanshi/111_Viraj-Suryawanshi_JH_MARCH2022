class Pat_2 {

	public static void main(String [] args) {
	
		for (int rows = 1; rows <= 9; rows++) {
			
			for (int column = 9 - rows; column >= 1; column--) {
				
				System.out.print(" ");
				
			}
			
			for (int num = 1; num <= rows; num++) {
				
				System.out.print(num + " ");
				
			}
			
			System.out.println();
			
		}
	
	}

}