package loops.example;
import java.util.Scanner;
import java.io.IOException;


public class UserInput {

	public static void main(String[] args)throws IOException {
		
		System.out.print("Enter your name: ");
		Scanner inputReader = new Scanner(System.in);
		String name = inputReader.nextLine();
        System.out.println("User Name: "+ name); 
	    inputReader.close();
		
	}
		
}