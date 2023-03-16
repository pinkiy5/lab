package thrusdaylab_2march;
import java.util.Scanner;
//write a java program to print sum of odd numbers upto N?
public class OddNumberSum {
	public static void main(String args[]) {
        int n, i, sum = 0;
        //taking number as a input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
 
        for(i = 0; i <= n; i++){  //for loop for addition of  odd number
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to " + n + " = " + sum); //prints sum of all odd numbers 
    }

}
