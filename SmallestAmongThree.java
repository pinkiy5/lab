//Java method to find the smallest number among three numbers
package thrusdaylab_9feb;
import java.util.Scanner;
public class SmallestAmongThree {
	public static void main(String[] args) {
		int p,q,r;
		//input three numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no: ");
		p=sc.nextInt();
		System.out.println("enter second no: ");
		q=sc.nextInt();
		System.out.println("enter third no: ");
		r=sc.nextInt();
		find_smallest(p,q,r);//callin function
}
	
	public static void find_smallest(int a,int b,int c) {//function that find smallest among three numbers
		if(a<=b && a<=c) {
			System.out.println("smallest no is: "+a);}
			else if(b<=a && b<=c) {
				System.out.println("smallest no is: "+b);
			}
				else
					System.out.println("smallest no is: "+c);
	
		
			}
		}
		
	


