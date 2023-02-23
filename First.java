/*Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However,
  the rate of interest varies according to banks.
  For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.*/
package thrusdaylab_23feb;

class Bank{  //parent class
	int getRateOfInterest(){  //parent class method
		return 0;
	}}
class Sbi extends Bank{ //child 1
    int getRateOfInterest(){
		return 8;
	}}
class Icici extends Bank{ //child 2
     int getRateOfInterest(){
		return 7;
	}}
class Axis extends Bank{ //child 3
     int getRateOfInterest(){
		return 9;
	}}

public class First {
	public static void main(String[] args) {
		Bank ref = new Sbi();
		System.out.println("rate of interest given by SBI bank is: "+ref.getRateOfInterest()+"%");
	     ref = new Icici();
		System.out.println("rate of interest given by ICICI bank is: "+ref.getRateOfInterest()+"%");
		 ref = new Axis();
		System.out.println("rate of interest given by AXIS bank is: "+ref.getRateOfInterest()+"%");
	}

}
