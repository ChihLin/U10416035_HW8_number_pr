//U10416035 Cheng Chih Lin

import java.util.*;
import java.math.BigDecimal;

public class PreciseFloat{

	//data field
	double x ,y , answer1 , answer2,answer3,answer4;
	int z;
	
	BigDecimal b1;
	BigDecimal b2;
		
	BigDecimal ans1 = new BigDecimal(0);
	BigDecimal ans2 = new BigDecimal(0);
	BigDecimal ans3 = new BigDecimal(0);
	BigDecimal ans4 = new BigDecimal(0);
		
	//construct to initialize the value
	PreciseFloat(String x, String y, int newZ){
	
		b1 = new BigDecimal(x);
		b2 = new BigDecimal(y);
		z = newZ;
	
	}
	
	//add the two number
	public void add(){
		
		ans1 = b1.add(b2);
		System.out.println("your fist number + second number is = " + ans1.doubleValue());
				
	}
	
	//subtract the two number
	public void subtract(){
		
		ans2 = b1.subtract(b2);
		System.out.println("your fist number - second number is = " + ans2.doubleValue());
		
	}

	//multiply the two number
	public void multiply(){
		
		ans3 = b1.multiply(b2);
		System.out.println("your fist number * second number is = " + ans3.doubleValue());
		
	}
	
	//divide the two number
	public void divide(){
		
		ans4 = b1.divide(b2, z ,BigDecimal.ROUND_HALF_UP);
		System.out.println("your fist number / second number is = " + ans4.toString());
		
	}
	
}
