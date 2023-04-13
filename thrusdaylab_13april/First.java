package thrusdaylab_13april;
import java.util.*;
//problem statement 1
public class First {
	//Develop a java class with a method storeOddNumbers(int N) using ArrayList 
	//to store even numbers from 2 to N, where N is a integer which is passed as a parameter to the
	//method storeOddNumbers().  The method should return the ArrayList (A1) created.
	
     ArrayList<Integer> A1 = new ArrayList<Integer>();
	
	public ArrayList<Integer> storeOddNumbers(int N) {
		A1 = new ArrayList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 != 0) A1.add(i);
		}
		
		return A1;
	}
	//In the same class create a method printOddNumbers()which iterates through the arrayList 
	//A1 in step 1,  and It should multiply each number with 5 and display it in format 5,15,25….5*N.
	//and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
	
	public ArrayList<Integer> printOddNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		for (int number : A1) {
			A2.add(number * 5);
			System.out.println(number * 5);
		}
		
		return A2;
	}
	//Create a method retrieveOddNumber(int N)  parameter is a number N. This method should search 
	//the arrayList (A1) for the existence of the number ‘N’ passed.  If exists it should 
	//return the Number else return zero
	
	public int retrieveOddNumber(int N){
		if (A1.contains(N)) {
			return N;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {  //main method
		First obj = new First();
		ArrayList<Integer> A1=obj.storeOddNumbers(15);
		System.out.println("list A1 is: "+A1);  //prints list A1
		ArrayList<Integer> A2=obj.printOddNumbers();
		System.out.println("list A2 is: "+A2);  //prints list A2
		int n = obj.retrieveOddNumber(5);
		System.out.println(n); //print number if exist else print 0
		

	}

}


