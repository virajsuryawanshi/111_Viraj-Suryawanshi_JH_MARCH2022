class Pat16 {
	int count = 1;
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {
			
			if (rows != 5) {
			
				for (int spaces = 1; spaces <= 5 - rows; spaces++) {
						System.out.print(" ");
					}
					
					if (rows != 1)
					System.out.print("*");
					
					for (int spaces = 1; spaces < rows - 1; spaces++) {
						System.out.print(" ");
					}
				
					System.out.println("*");
			
			}
			
			else {
				
				for (int star = 1; star <= 5; star++)
					System.out.print("*");
				
			}
 
			
		}				
		
	}
	
}
