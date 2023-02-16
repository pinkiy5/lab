package thrusdaylab_16feb;

class Teacher{// base class
	String designation = "Lecturer";
	String college = "Anudip";
	void work() {
		System.out.println("I work in "+college+" as a "+designation);
	}
}
 class IT_Teacher extends Teacher{ //sub class extends Teacher
	 String lecturerpost = "IT Teacher";
	 void post() {
		 System.out.println("My post is :"+lecturerpost);
	 }
 }
 class Math_Teacher extends Teacher{ //sub class extends Teacher
	 String lecturerpost = "Math Teacher";
	 void post() {
		 System.out.println("My post is :"+lecturerpost);
	 }

 }
 class Soft_Skill_Teacher extends Teacher{  //sub class extends Teacher
	 String lecturerpost = "Soft Skill Teacher";
	 void post() {
		 System.out.println("My post is :"+lecturerpost);
	 }

 }

public class ThirdTask {
	public static void main(String[] args) {
		IT_Teacher a = new IT_Teacher();
		Math_Teacher b = new Math_Teacher();
		Soft_Skill_Teacher c = new Soft_Skill_Teacher();
		a.post();
		a.work();
		b.post();
		b.work();
		c.post();
		c.work();

		
	}

}
