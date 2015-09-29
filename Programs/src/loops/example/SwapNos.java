package loops.example;
import java.util.Scanner;
public class SwapNos {

		public static void main(String[] args) {
		// swaping numbers using temp var
		 
		      int x, y, temp;
		      System.out.println("Enter x and y");
		      Scanner in = new Scanner(System.in);
		 
		      x = in.nextInt();
		      y = in.nextInt();
		 
		      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		 
		      temp = x;
		      x = y;
		      y = temp;
		     System.out.println("After Swapping\nx = "+x+"\ny = "+y);
		}
}


