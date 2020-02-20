package learn;
import java.util.Scanner;
public class SwitchCaseExVowelConsonant {

	public static void main(String[] args) {
		boolean isVowel=false;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the character");
    char ch=scan.next().charAt(0);
    scan.close();
    switch(ch)
    {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    	isVowel=true;
    
    }
    if(isVowel==true)
    {
    	System.out.println(ch+" is vowel");
    }
    else if((ch>'a' && ch<='z')||(ch>'A' && ch<='Z'))
    	System.out.println(ch+" is consonant");
    else System.out.println("input is not an alphabet");
	}

}
