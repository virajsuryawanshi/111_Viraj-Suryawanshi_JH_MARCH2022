class Pat15 {
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {
			
			System.out.print("*");
			
			if (rows != 5){
			
				for (int spaces = 1; spaces < rows - 1; spaces++){
					
					System.out.print(" ");
					
				}
				
				if (rows != 1)
					System.out.print("*");
				
			}
			
			else
				
				for (int star = 1; star < rows; star++){
					
					System.out.print("*");
					
				}
				
				System.out.println();
			
		}

			
	}				
		
}
