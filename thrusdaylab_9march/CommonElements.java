package thrusdaylab_9march;
import java.util.*;
//Write a Java program to find common elements from three sorted (in non-decreasing order)arrays.
public class CommonElements {
	public static void main(String[] args) {
	ArrayList<Integer> common = new ArrayList<Integer>();
    //initialize , instantiation of jagged arrays  
	   int arr1[] = {2, 4, 8, 6};
	   int arr2[] = {2, 3, 4, 8, 10, 6};
	   int arr3[] = {5, 9, 3, 4, 8, 14, 40};
		int x = 0, y = 0, z = 0;
		while (x < arr1.length && y < arr2.length && z < arr3.length){  
			if (arr1[x] == arr2[y] && arr2[y] == arr3[z]){
				common.add(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if (arr1[x] < arr2[y])
				x++;
			else if (arr2[y] < arr3[z])
				y++;
			else
				z++;
		}
		System.out.println("common elements from three sorted (in non-decreasing order ) arrays: ");
	System.out.println(common);
	}
	}
