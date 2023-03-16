package thrusdaylab_9march;
//we need to print the elements of the array which are present in odd positions.
//This can be accomplished by looping through the array and printing the elements of
//an array by incrementing i by 2 till the end of the array is reached.
public class ElementsInOddPosition {
	public static void main(String[] args) {  
        //initialize , instantiation of array  
       int [] arr = new int [] {11, 12, 33, 14, 25, 16, 72, 13, 45};  
        System.out.println("elements of array on odd position: ");  
        //Loop for array by incrementing value of i by 2 till end of array
        for (int i = 0; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  


