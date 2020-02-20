package learn;
import java.util.Scanner;
public class SumOfNaturalNumUsingForLoop {

	public static void main(String[] args) {
		int sum=0,i,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number upto which you want sum");
		n=scan.nextInt();
		scan.close();
		
		for(i=1;i<=n;i++)
		{
		sum=sum+i;	
		}
System.out.println("Sum is "+sum);
	}

}
