class Pattern6 {
	int count = 1;
	static int spc = 0;
	static int incBy2 = 1;
	
	public static void main(String args []) {
		
		for (int rows = 1; rows <= 5; rows++) {
			
			if (rows != 5) {
			
				for (int spaces = 1; spaces <= 5 - rows; spaces++) {
						System.out.print(" ");
					}
					
					if (rows != 1)
					System.out.print("*");
					
					spc = incBy2;
					
					while (spc > 0) {
						System.out.print(" ");
						spc--;
					}
					
					incBy2 += 2;
				
					System.out.println("*");
			
			}
			
			else {
				
				for (int star = 1; star <= 6; star++)
					System.out.print("* ");
				
			}
 
			
		}				
		
	}
}
