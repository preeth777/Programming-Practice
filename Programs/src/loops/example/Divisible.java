package loops.example;


public class Divisible {

	public static void main(String[] args) {
		// a program print "ping" if a number is divisible by 3,
		//"pong" if a number is divisible by 5, and 
		//"ping pong" if number is divisible by both, 
		//else print the number
		for (int x=1; x <= 100; x++){
		    if( x % 3 == 0 ){
		        System.out.println("ping");
		    }
		    if( x % 5 == 0 ){
		    	System.out.println("pong");
		    }
		    if( ( x % 3 != 0 ) && ( x % 5 != 0 ) ){
		    	System.out.println(x);
		    }
		}
	}

}
