package thrusdaylab_6thapril;
import java.io.*;
//Write a Java program to read contents from a file into byte array
public class Second {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\assignment.txt");  
            byte[] arr = new byte[1024]; //byte array
            int i =0;
		    while((i = f.read(arr)) > 0) {
		    	System.out.println(new String (arr,0,i-1));
		     }
		    f.close();
		    System.out.println("content reading complete");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
