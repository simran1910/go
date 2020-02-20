package learn;
import java.util.Scanner;
public class LargestNumUsingTernaryOperator {

	public static void main(String[] args) {
		int n1,n2,n3,res,temp;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number 1");
		n1=scan.nextInt();
		System.out.print("Enter number 2");
		n2=scan.nextInt();
		System.out.print("Enter number 3");
		n3=scan.nextInt();
		scan.close();
		
		temp= n1>n2?n1:n2;
		res=n3>temp?n3:temp;
		System.out.print("Largest number is "+res);

	}

}
