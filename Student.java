//Create a Student class to take different types constructor to set different properties ( values ).
package thrusdaylab_9feb;

public class Student {
	String course;
	Student(String c){       //default constructor created
		System.out.println("we are in student class default constructor is created");
		course=c;
		System.out.println("The course is: "+course);

	}
	Student(String p,int a,int b){   //parameterized constructor created having record of student
		System.out.println("The name is: "+p);
		System.out.println("Roll no is: "+a);
		System.out.println("The batch is: "+b);

	}
	public static void main(String[] args) {
		Student s1=new Student("JAVA");//object for default constructor
		Student s=new Student("PINKI",1,789);  //object created of student class and also values are passed in object as argument
	}
	

}
