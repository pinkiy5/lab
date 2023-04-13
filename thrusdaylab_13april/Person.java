package thrusdaylab_13april;
import java.util.*;
/*Problem Statement 2:
Create a Person class and create an array list to add 10 person objects and 
print them using a for each loop*/

public class Person {
	public static void main(String[] args) {
		Person ob = new Person();
		ArrayList<Person> objlist=new ArrayList<Person>();  //creating list
		//adding 10 person objects in list
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
		objlist.add(new Person());
       //print using for each loop
		for ( Person object : objlist) {
			System.out.println(object);
		}
		
	}

}
