package arrays.example;
import java.util.*;


public class ArrayCombine {

	public static void main(String[] args) {
		int[] first = { 10,20,30,40,50 };
	    int[] second = { 60,70,80,90,100 };
	    int[] combined = new int[10];

	    merge(first, first.length, second, second.length, combined);
	    for (int i : combined) {
	      System.out.println(i);
	    }
	}  
	      
	      public static void merge(int[] first, int sizeA, int[] second, int sizeB, int[] combined) {
	    	    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

	    	    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
	    	      if (first[arrayAIndex] < second[arrayBIndex])
	    	        combined[arrayCIndex++] = first[arrayAIndex++];
	    	      else
	    	        combined[arrayCIndex++] = second[arrayBIndex++];

	    	    while (arrayAIndex < sizeA)
	    	      combined[arrayCIndex++] = first[arrayAIndex++];

	    	    while (arrayBIndex < sizeB)
	    	      combined[arrayCIndex++] = second[arrayBIndex++];
	    	  }

}


