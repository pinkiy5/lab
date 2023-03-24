package thrusdaylab_23rdmarch;

public class Third {
	public int addTwoPositive (int a,int b) {
		
			if (a>0 && b>0) {
				return a+b;

				}
			else {
				throw new ArithmeticException("Non-positive integer sent");

			}
			}
     public static void main(String[] args) {
    	 Third obj = new Third();
    	 int result = obj.addTwoPositive(-4, 5);
    	 System.out.println("sum of two numbers are: "+result );
	}
}
