package files.example;

import java.io.*;
import java.util.StringTokenizer;



public class NumberWords {

	public static void main(String[] args)throws Exception {
				
		FileReader fr = new FileReader("C:\\Users\\preet_000\\Documents\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "", str = "";
		int a = 0;
		int b = 0;
		while ((line = br.readLine()) != null) {
		str += line + " ";
		b++;
		
		}
		br.close();
		System.out.println("Totally " + b + " lines");
		 
		System.out.println(str);
		 
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
		String s = st.nextToken();
		System.out.println(s);
		a++;
		}
		System.out.println("File has " + a + " words are in the file");
		}
}
		 
		





