package thrusdaylab_6thapril;
import java.util.Scanner;
import java.io.*;
/*create a java program to read n print the content to/from the file
  Note: display two options 1 for store data 2 for print data,
  if user press 1 then read the data from console and store it in file, 
  if user press 2 print the data from the file*/

public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 1 for store or 2 for print");
		System.out.println("Enter 1 for store: ");
		int i  = sc.nextInt();
		if(i==1) {  // for storing in file
			try {
				//destination
				FileOutputStream f = new FileOutputStream("E:\\assignment1.txt");
				String s = "This is Thrusday Lab Work";
				byte b[]=s.getBytes(); //converting string into byte array
				f.write(b);
				f.close();
				System.out.println("Data enter successfully");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		else { 
			System.out.println("Invalid number entered");}
			//for retrieving from file
		System.out.println("Enter 2 for print: ");
		int j  = sc.nextInt();
		if(j==2) {
			try {
				FileInputStream f = new FileInputStream("E:\\assignment1.txt");  //source path
				//reading All character
				int k = 0;
				while((k=f.read()) != -1){
				System.out.print((char)k);  //convert it into character
			}
			f.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		else {
			System.out.println("Invalid number entered");
		}
	}}





