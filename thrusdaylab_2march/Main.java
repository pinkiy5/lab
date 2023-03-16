package thrusdaylab_2march;
//Main class for library class
public class Main {
	public static void main(String[] args) {
		Library obj = new Library();  //creating object of library class
		obj.addBook(101, "Ramayan", "Valmiki");  //calling methods and pass values of library class
		obj.addBook(102, "Mahabharat", "Vyasa");  

        obj.dispanseBook(101, "Ramayan");
	}

}
