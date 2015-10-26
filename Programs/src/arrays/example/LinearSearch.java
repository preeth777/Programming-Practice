package arrays.example;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] array={10,20,30,50,80,-22};

	       System.out.println(" The contents of the Array are :");

	       for(int i=0;i<array.length;i++)
	          System.out.println(" Array[" + i + "] = " + array[i]);

	       int search_element=20;
	       int find_index=-1;

	       for(int j=0;j<(array.length-1);j++)
	       {
	          if(array[j]==search_element)
	          {
	             find_index=j;

	             break;
	          }
	       }

	       if(find_index!=-1)
	       {
	          System.out.println(" The search element is : " + search_element);
	          System.out.println(" It is found in the array at position : " + find_index);
	       }

	       else
	          System.out.println("\n The search element is not found in the array.");
	    }

}


