package thrusdaylab_23rdmarch;
//throw exception if two no are negative else print product of x and y
public class Second {
	public static void mulnum(int x,int y) {
		if(x>0 && y>0) {
			int product = x*y;
			System.out.println("product of two numbers are: "+product);
		}
		else {
			throw new ArithmeticException("x and y should not be zero");

		}
	}
	public static void main(String[] args) {
		mulnum(-20,20);
	}

}
