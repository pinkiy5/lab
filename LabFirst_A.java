package Class;
import java.util.Scanner;
// input 5 numbers and calculate average of the numbers
public class LabFirst_A {
	public static void main(String[] args)  
    {  
      int  count = 1 ,store,average, sum = 0;   //declaring variables with initial values
      Scanner sc = new Scanner(System.in);       //to take input
      while (count <= 5)                     //to execute condition 5 times
             {   
                  System.out.println("input "+count+" number:");  //print input no counts
                  store = sc.nextInt();  //all no stored in store variable
                  sum += store;       //sum of all values in store
                  count++;              //to increment the count after every execution of while loop
             }   
                  average = sum/5;   //calculate average of 5 input no
        System.out.println("The Average is: "+average);  //print average of numbers
    }    

}
