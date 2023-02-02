package Class;
// swipe two numbers using another temporary variable
public class LabFirst_B {
	public static void main(String[] args) {
		int firstvar=2,secondvar=5,tempvar;  //delaring variables with initial values
		//before swap
		System.out.println("Before swap"); 
        System.out.println("firstvar = " + firstvar);
        System.out.println("secondvar = " + secondvar);
		//performing swipe
		tempvar=firstvar;  
		firstvar=secondvar;
		secondvar=tempvar;
		//print both numbers aftyer swapping
		System.out.println("After swap"); 
        System.out.println("firstvar = " + firstvar);
        System.out.println("secondvar = " + secondvar);
		
	}
	}
