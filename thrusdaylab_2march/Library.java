package thrusdaylab_2march;
//Program too create library book Management system to store and display book details in library
//where you can create two classes one is main another one is library, where you can create two methods as addBook,dispanseBook 
//and bookId,bookName,bookAuthor as instance variables.
public class Library {
	//instance variable
	 int bookId;
	 String bookName;
	 String bookAuthor;
	 //method 1
	void addBook(int bookId,String bookName,String bookAuthor) {
		System.out.println("The book id is : "+bookId);
		System.out.println("The book Name is : "+bookName);
		System.out.println("The book Author Name is : "+bookAuthor);

		}
	//method 2
	void dispanseBook(int bookId,String bookName) {
		System.out.println("Id and Name of book which is dispensed : "+bookId+" , "+bookName);
		
	}

}
