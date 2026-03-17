package qs_code;
import java.util.Scanner;

public class Currency {
	public static void check(int amt)
	{
		int tt,fh,th,ff,tw,ten;
		tt=amt/2000;
		amt%=2000;
		fh=amt/500;
		amt%=500;
		th=amt/200;
		amt%=200;
		ff=amt/50;
		amt%=50;
		tw=amt/20;
		amt%=20;
		ten=amt/10;
		amt%=10;
		System.out.println("2000: "+tt+"\n500: "+fh+"\n200: "+th+"\n50: "+ff+"\n20: "+tw+"\n10: "+ten);
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int amt,tt,fh,th,ff,tw,ten;
		System.out.print("Enter amt :");
		amt=sc.nextInt();
		check(amt);
		
		
		
		
	}

}
