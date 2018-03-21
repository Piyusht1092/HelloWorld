import java.io.*;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner input  = new Scanner (new File(args[0]));
		System.out.println("1st program of my life");
		
		while (input.hasNextLine()) {
		    System.out.println(input.nextLine());
		}
	}

}
