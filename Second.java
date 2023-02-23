// Develop code by Method Overridding.. picture Referece given below
package thrusdaylab_23feb;

class Employee{ //parent class
	void incrementSalary(int salary , int hike) {
		double incrementSalary=salary+(salary * hike);
	}}
class Developer extends Employee{ //child 1
	void incrementSalary(int salary , int hike) {
		double incrementSalary=salary+(salary * hike);
		System.out.println("The incremented salary of developer is :" +incrementSalary);
	}}
class Manager extends Employee{  //child2
	void incrementSalary(int salary , int hike) {
		double incrementSalary=salary+(salary * hike);
		System.out.println("The  incremented salary of manager is :" +incrementSalary);
}}
	
public class Second {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.incrementSalary(25000, 200);
		Manager m = new Manager();
		m.incrementSalary(30000, 300);
		
	}

}
