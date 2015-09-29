package arrays.example;
import java.util.Arrays;


public class MissingNoFind {

	public static void main(String[] args) {
		
		System.out.println("Missing number in sorted array "); 
		int[] input = new int[]{0, 2, 3, 4, 6}; 
		int missing = missingNumber(input); 
		System.out.println("Missing number from array : " + Arrays.toString(input) + " is : " + missing); 
		
		}
	public static int missingNumber(int[] numbers) { 
		
		if (numbers == null || numbers.length <= 0) { 
			throw new IllegalArgumentException("Null or Empty array not permitted"); 
			} 
		int left = 0; 
		int right = numbers.length - 1; 
		while (left <= right) { 
			int middle = (right + left) >> 1; 
		if (numbers[middle] != middle) { 
			if (middle == 0 || numbers[middle - 1] == middle - 1) { 
				return middle;
				} 
			right = middle - 1; 
			} else 
			{ left = middle + 1; 
			} 
		
		} throw new RuntimeException("No missing number"); 
	
	} 
}


