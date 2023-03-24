package thrusdaylab_23rdmarch;
import java.util.Scanner;
//runs for all 4 inputs
//0 input = 10,3
//1 input = 10,hello
//2 input = 10,0
//3 input = 23.323,0
public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two integers: ");
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("result : "+ x/y);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
