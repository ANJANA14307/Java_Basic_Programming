package qs_code;
import java.util.Scanner;
public class Casecheck {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a;
		System.out.println("Enter a char: ");
		a=sc.next().charAt(0);
		if(a>='A' && a<='Z')
		{
			System.out.println("Uppercase");
		}
		else if(a>='a' && a<='z')
		{
			System.out.println("Lowercase");
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	
		
		
	}
}
