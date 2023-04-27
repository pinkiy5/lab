package thrusdaylab_27april;
import org.hibernate.Session; 
import org.hibernate.Transaction;


public class Mainclass {
	public static void main(String[] args) { 
		Theater movie1 = new Theater(1234,"Dhamaal","9 AM - 12 PM"); 
		Theater movie2 = new Theater(3456,"Golmaal","12 PM - 3 PM"); 
		Theater movie3 = new Theater(2545,"HeraPheri","3 PM - 6 PM");
		Theater movie4 = new Theater(3434,"Masti","6 PM - 9 PM"); 
		Theater movie5 = new Theater(7834,"Chup Chup Ke","9 PM - 12 AM"); 

		Transaction txn; 
		try(Session session = HibernateUtil.getSessionFactory().openSession()){ 
		txn = session.beginTransaction(); 
		session.save(movie1); 
		session.save(movie2); 
		session.save(movie3); 
		session.save(movie4); 
		session.save(movie5); 

		txn.commit(); 
		} 
		} 

}
