package learn;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the number you want to check");
	int num=scan.nextInt();
	scan.close();
	if(num<0)
		System.out.print(num+"is negative");
	else if(num>0)
		System.out.print(num+"is positive");
    else
    	System.out.print(num+"is neither positive nor negative");
	}

}
