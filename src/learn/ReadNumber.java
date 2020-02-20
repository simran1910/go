package learn;
//IMORTANT LINE 3
import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		
		// This reads the input provided by user using keyboard
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter any number");
		
		// This method reads the number provided using keyboard
		int num= scan.nextInt();
		
		 // Closing Scanner after the use
        scan.close();
        
        // Displaying the number
		System.out.print("The number entered by the user:"+num);
		
	}

}
