package thrusdaylab_16feb;

 class Arithmetic {  //super class 
	
   int add(int a, int b) {  //add method taking integers as parameter and return their sum
	   int c = a+b;
	   return c;
   }
}

public class Adder extends Arithmetic {  //sub class inherits super class Arithmetic
	public static void main(String[] args) {
		Adder ad = new Adder();
		int result = ad.add(5, 6);   //calling add function of super class passing two integer values and store result in result
		System.out.println("sum of two integer is : "+result);
		
	}
	
	
}