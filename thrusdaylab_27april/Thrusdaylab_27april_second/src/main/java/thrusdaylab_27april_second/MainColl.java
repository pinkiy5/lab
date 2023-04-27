package thrusdaylab_27april_second;
import org.hibernate.Session; 
import org.hibernate.Transaction;


public class MainColl { 

public static void main(String[] args) { 

Student pinki = new Student("Pinki Yadav","IT"); 

College id = new College(02311); 

pinki.setCollege(id); 

Transaction txn; 

try(Session session = HibernateUtil.getSessionFactory().openSession()){ 

txn = session.beginTransaction(); 

session.save(pinki); 

txn.commit();
}
}
}
