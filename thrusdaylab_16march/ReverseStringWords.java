package thrusdaylab_16thmarch;
//Write a java program to reverse every word in string.
public class ReverseStringWords {
	public static void my() { //static method
		String str = "Anudip Foundation is good center";
		//string array stores string after splitting
		String words[]=str.split(" ");  
	    String reverseword="";  
	    //for each loop for reversing the string 
	    for(String w:words){  
	        StringBuilder b=new StringBuilder(w);  
	        b.reverse();  
	        reverseword += b.toString()+" ";  
	    } 
	    //prints output
	    System.out.println(reverseword);
	}
	
public static void main(String[] args) {
	//calling my() method
	my();
}
}

