package thrusdaylab_6thapril;
import java.io.*;
import java.io.Serializable;
//Write a java code by using ObjectInput & OutputStream along with transient keyword.
public class Third implements Serializable {
    int i = 10;
    // Transient variable
    transient int k = 30;
    public static void main(String[] args) throws Exception
    {
    	Third ob = new Third();
  
        // serialization
        FileOutputStream fos = new FileOutputStream("E://file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ob);
        oos.flush();
		oos.close();
		fos.close();
		System.out.println("serialization complete");
  
        // deserialization
        FileInputStream fis = new FileInputStream("E://file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Third obj = (Third)ois.readObject();
        System.out.println("i = " + obj.i);
        System.out.println("k = " + obj.k);
        ois.close();
        fis.close();
        System.out.println("deserialization complete");
        
    }

}
