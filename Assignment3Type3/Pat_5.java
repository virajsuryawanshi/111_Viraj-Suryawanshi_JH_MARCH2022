class Pat_5 {
	
	static int num;

	public static void main(String [] args) {
	
		for (int rows = 9; rows >= 1; rows--) {
			
			for (int column = rows; column <= 9; column++) {
				
				System.out.print("  ");
				
			}
			
			for (num = 1; num <= rows; num++) {
				
				System.out.print(num + " ");
				
			}
			
			num--;
			
			for (num--; num >= 1; num--){
				
				System.out.print(num + " ");
				
			}
			
			System.out.println();
			
		}
	
	}

}