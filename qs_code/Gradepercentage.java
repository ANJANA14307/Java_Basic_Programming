package qs_code;
import java.util.Scanner;

public class Gradepercentage {
	public static void gradecalc(int p,int c, int m, int comp,int b)
	{
		double avg;
		int tot,per;
		tot=p+c+m+comp+b;
		avg=tot/5;
		per=(int)avg*100;
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per>60)
		{
			System.out.println("Grade D");
		}
		else if(per>=40)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int p,c,m,b,comp;
		System.out.println("Enter grade of physics: ");
		p=sc.nextInt();
		System.out.println("Enter grade of chemistry: ");
	    c=sc.nextInt();
	    System.out.println("Enter grade of maths: ");
	    m=sc.nextInt();
	    System.out.println("Enter grade of biology: ");
	    b=sc.nextInt();
	    System.out.println("Enter grade of computer: ");
	    comp=sc.nextInt();
	    gradecalc(p,c,m,comp,b);
		
	}

}
