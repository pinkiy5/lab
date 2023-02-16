package thrusdaylab_16feb;
//this is multilevel inheritance 
class A{ // base  class
	  String college = "Anudip";
	  void printcollege() {
		  System.out.println("college name is : "+college);
	  }
}

class B extends A {  //derived class extends Task class 
	   int id = 2;
	   void printid() {
		   System.out.println("the id of student is :"+id);
	   }
}

class C extends B{  // derived class extends FirstTask class
	    String name = "pinki";
	    String batch = "C4119";
	    void printdetails() {
	    	System.out.println("The Name and Batch of student in collge " +college+ " of id " +id+ " are " +name+ " and  "+batch);
	    }
}

public class SecondTask {
	public static void main(String[] args) {
		C obj = new C();
		obj.printcollege();
		obj.printid();
		obj.printdetails();
		
	}

}
