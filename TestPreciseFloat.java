//U10416035 Cheng Chih Lin

import java.util.Scanner;

public class TestPreciseFloat {

	public static void main(String[] args) {
	
			//new Scanner
			Scanner input = new Scanner(System.in);

			//prompt the user
			System.out.println("Enter two number and it will run the arithmetic");
	
			System.out.print("Enter the first number = ");
			String x = input.nextLine();
			
			System.out.print("Enter the second number = ");
			String y = input.nextLine();
			
			//prompt the user to decide the decimal
			System.out.print("Enter the decimal you want (the divide needed)= ");
			int z = input.nextInt();	

			//new object
			PreciseFloat pf = new PreciseFloat(x,y,z);
			
			//invoke method
			pf.add();
			pf.subtract();
			pf.multiply();
			pf.divide();
			
	}
}
