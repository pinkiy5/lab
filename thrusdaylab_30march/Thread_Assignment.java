package thrusdaylab_30march;
//problem statement 1
class ListLoader{  //creating class listloader
	int[] intArray = new int[150]; //instantiate an array of size 150
	public void loadList(int startNumber, int lastNumber) {  //creating method loadlist with 2 arguments
		for(int i = startNumber; i<= lastNumber; i++) {
			intArray[i]= i;
		}
	}
}

public class Thread_Assignment {  //main class
	public static void main(String[] args) {
		ListLoader obj = new ListLoader();  //creating object of listloader class
		long start = System.currentTimeMillis();  //method used to print time in milliseconds
		obj.loadList(0,100);
		long end = System.currentTimeMillis();
		
	    System.out.println("Response Time: "+ (end-start));  //print response time taken to execute


		
	}

}
