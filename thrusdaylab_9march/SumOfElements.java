package thrusdaylab_9march;
//A Java program to find all pairs of elements in an array whose sum is equal to a specified number

public class SumOfElements {
	//creating static method Elements_value taking 2 arguments an array and number
	static void  Elements_value(int array[], int number)
	  {
	  System.out.println("pairs of elements in array and their sum is : ");
	 
	  for (int i =  0; i < array.length; i++) //loop for index starting at 0 
	  {
	  for (int j  = i+1; j < array.length; j++) // loop for index starting at 1
	  {
	  if(array[i]+array[j] == number)  //checking both index value sum is equal to number or not
	  {
	  System.out.println(array[i]+" + "+array[j]+" =  "+number); //prints sum
	  }
	  }
      }
 }
	  
	  public static void  main(String[] args)
	  {
		  Elements_value(new int[] {2, 6, 7, 4, -5, 8 , 1 , 19, 5}, 9); //passing anonymous array and specified number to method Elements_value
	  	  
	  }
	}


