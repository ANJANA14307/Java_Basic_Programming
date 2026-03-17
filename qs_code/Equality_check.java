package qs_code;
import java.util.Scanner;

public class Equality_check {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Both are same");
			
		}
		else if(a>b)
		{
			System.out.println(a+" is great");
		}
		else
		{
			System.out.println(b+" is great");
		}
	}

}
