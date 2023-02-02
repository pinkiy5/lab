package Class;
import java.util.Scanner;
//print sum,multiply,subtract,divide and remainder of 2 numbers first is 125 and second is 24
public class LabFirst_D {
	public static void main(String[] args) {
		int a,b,sum,sub,mul,div,rem;
	      Scanner sc = new Scanner(System.in);       //to take input in a and b variables
	      System.out.println("input first number:");
	      a=sc.nextInt();
	      System.out.println("input second number:");
	      b=sc.nextInt();
	      sum=a+b;                             //calculate sum
	      System.out.println("sum is: "+sum);  //print sum
	      sub=a-b;                             //calculate subtraction
	      System.out.println("subtraction is: "+sub);  //print subtraction
	      mul=a*b;                                    // calculate multiplication
	      System.out.println("multiplication is: "+mul); //print multiplication
	      div=a/b;                                       //calculate division
	      System.out.println("division is: "+div);   //print division
	      rem=a%b;                                    //calculate remainder
	      System.out.println("remainder is: "+rem); //print remainder
	      }
}
