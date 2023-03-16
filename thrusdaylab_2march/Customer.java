package thrusdaylab_2march;

public class Customer {
	// private instance variable
	private int accountNumber;
	private String accountName;
	private float accountBalance;
	//method 1 to create account
	void createAccount(int accountNumber,String accountName,float accountBalance) {
		System.out.println("Account name "+accountName+" has account number "+accountNumber+" and balance is "+accountBalance);

	}
	// method  2 to set amount
	void setAmount(float amount ,int accountNumber) {
		System.out.println("amount " +amount+" credit in account number "+ accountNumber);
	}
	//method 3 to get amount
	void getAmount(int accountNumber, float accountBalance) {
		System.out.println("After credit account number "+accountNumber+ " balance is "+accountBalance);
		
	}
    // method 4 to withdraw amount from accountBalance
	void withdrawAmount(int accountNumber, float accountBalance) {
		System.out.println("After withdraw balance of account number "+accountNumber+ " is "+accountBalance);
	}
	

}
