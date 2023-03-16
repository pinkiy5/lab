package thrusdaylab_2march;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Customer obj = new Customer();  //creating object of customer class
		//adding details using createAccount method
		System.out.println("first customer's details are: ");
		obj.createAccount(2345,"Pinki", 25000f);
		System.out.println("second customer's details are: ");
        obj.createAccount(9875,"Sapna", 35000f);
        //adding amount using setAmount method
       obj.setAmount(4500,2345);
       //getting details using getAmount method
       obj.getAmount(2345,29500f);
       //ater withdraw print details using wthdrawAmount method
       obj.withdrawAmount(9875, 15000f);

        

		
	}

}
