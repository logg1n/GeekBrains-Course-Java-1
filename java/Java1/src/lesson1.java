/* **************************	#.1	*/ 

public class lesson1 {

	public static void main(String[] args) {
/* **************************	#.2	*/
		byte val_byte = 10;
		short val_short = 100;
		char val_char = 'a';
		int val_int = 1000;
		float val_float = 1.10f;
		long val_long = 10000l;
		double val_double = 10.10;
		boolean val_boolean = true;
		
		
/* **************************	#.3	*/
		int a = 1, b = 3, c = 5, d = 7;
		System.out.printf("%d*(%d+(%d/%d) = %d\n",a, b, c, d, MathOp(a, b, c, d));
		
		
/* **************************	#.4	*/
		int num1 = 15, num2 = 2, sum;
		System.out.print(num1 + " + " + num2 + " = " +(sum = num1 + num2) + " | ");
		System.out.println(sum +" >= 10 and <= 20 -> " + NumEq(num1, num2));
		
		
/* **************************	#.5	*/		
		int num3 = -165;
		NumCheckPos(num3);
		
		
/* **************************	#.6	*/
		// int num3 = -165;  #.5
		System.out.println(num3 + " < 0 -> " +NumCheckNeg(num3));
		
		
/* **************************	#.7	*/
		String name = "Denis";
		printName(name);

		
/* **************************	#.8	*/		
		int year = 2000;
		yearLeap(year);
			
	}
	

	
	
	
	
	
/* *************	Methods	************ */
	
/*	---------- #.3 ----------	*/
	static int MathOp(int a, int b, int c, int d) {
		return a * (b + (c / d));
	}

/*	---------- #.4 ----------	*/
	static boolean NumEq(int a, int b){
		int c = a + b;
		if((c >= 10) && (c <= 20)) 
			return true;
		
		
		return false;
	}
	
/*	---------- #.5 ----------	*/
	static void NumCheckPos(int num) {
		if(num >= 0) 
			System.out.printf("%d -> положительное.\n", num);
		
		System.out.printf("%d -> отрицательное.\n", num);
	}
	
/*	---------- #.6 ----------	*/
	static boolean NumCheckNeg(int num) {
		if(num < 0) 
			return true;;

		return false;
	}
	
/*	---------- #.7 ----------	*/
	static void printName(String name) {
		System.out.printf("Hello, %s!\n", name);
	}


/*	---------- #.8 ----------	*/
	static void yearLeap(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0)
			System.out.println(year +" високосный");
		
		else 
			System.out.println(year +" не високосный");
		
	}
}
