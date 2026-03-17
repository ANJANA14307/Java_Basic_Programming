
  package qs_code;
  import java.util.Scanner;
  
  /*public class LeapYear { public static void main(String[] args)
  { Scanner
  sc=new Scanner(System.in);
  int year=sc.nextInt(); 
  if((year%100==0 &&year%400==0)||(year%4==0)) 
  { System.out.println("Leap year");
  } 
  else
  System.out.println("Not leap"); }
  
  }
  */
  class LeapYear{
	  public static boolean leap(int year)
	  {
		  if((year%100==0 &&year%400==0)||(year%400==0)) 
		  { return true;
		  } 
		  else
		  return false;
		  }
		  
	  
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int year =sc.nextInt();
	  boolean res=leap(year);
	  System.out.println(res);
  }
  }
 