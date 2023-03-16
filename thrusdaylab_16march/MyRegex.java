package thrusdaylab_16thmarch;
import java.util.regex.*;
//Write a class called MyRegex which will contain a string pattern. 
//You need to write a regular expression and assign it to the pattern 
//such that it can be used to validate an IP address.
class MyRegex {
	public static void main(String[] args) {
		//expression for valid ip address
		String regex= "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" +
		"\\."+ "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + 
		"\\." + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])" + 
		"\\." + "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		
		// Compile the regex  
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher("000.12.12.034"); 
		boolean b =m.matches();
		System.out.println(b);
		
		Matcher m1 = p.matcher("121.234.12.12"); 
		boolean b1 =m1.matches();
		System.out.println(b1);

		
		Matcher m2 = p.matcher("23.45.12.56"); 
		boolean b2 =m2.matches();
		System.out.println(b2);

		
		Matcher m3 = p.matcher("00.12.123.123123.123"); 
		boolean b3 =m3.matches();
		System.out.println(b3);

		
		Matcher m4 = p.matcher("122.23"); 
		boolean b4 =m4.matches();
		System.out.println(b4);

		
		Matcher m5 = p.matcher("Hello.IP"); 
		boolean b5 =m5.matches();
		System.out.println(b5);
  }
}
