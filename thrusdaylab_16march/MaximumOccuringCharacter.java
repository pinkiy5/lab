package thrusdaylab_16thmarch;
// Write a java program to find the maximum occurring character in a string.
public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		int max = -1;
		char maxChar = ' ';
		//string for test
		String str = "maximum occurring character";
		//creating an array of size 150
		int arr[]=new int[150];
		// for loop to count string characters
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		//for loop to find the maximum occurrence of a character
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(max<arr[ch]) {
				max = arr[ch];
				maxChar = ch;
				
			}
		}
			//print the output
	 System.out.println("Maximum occurring character is " +maxChar+ " and occurance is "+max+ " times.");

	}

}
