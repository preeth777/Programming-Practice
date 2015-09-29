package loops.example;

public class SwapNumbers {

		public static void main(String[] args) {
		// swaping nos without using temp var
		
		int x = 10;

        int y = 20;

        System.out.println("Before swap:");

        System.out.println("x value: "+x);

        System.out.println("y value: "+y);

        x = x+y;

        y=x-y;

        x=x-y;

        System.out.println("After swap:");

        System.out.println("x value: "+x);

        System.out.println("y value: "+y);

	}

}
