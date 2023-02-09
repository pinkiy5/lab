//How to create object in java, show demo using program.
package thrusdaylab_9feb;
//class created
public class CreateObect {
	//class has printname function prints a name pass by object of class
	public static void printname(String n){
		System.out.println(" your name is: "+n);
	}
public static void main(String[] args) {
	//obj object of LabSecond_A is created
	CreateObect obj =new CreateObect();
	obj.printname("pinki");  // obj calls printname function and pass a name to print
	
	
	
}

}
