package arrays.example;
import java.util.Arrays;


public class ArraySort {
	//sort String array using sort method
	public static void main(String[] args) {
                String[] strArray = new String[]{"John", "alex", "Chris", "williams", "Mark", "Bob"};
                // To sort String array in java, use Arrays.sort method.
                //Sort method is a static method.               *
               
               Arrays.sort(strArray);
               System.out.println("String array sorted");
                //print sorted elements
                for(int i=0; i < strArray.length; i++){
                        System.out.println(strArray[i]);
                 }
	}

}
