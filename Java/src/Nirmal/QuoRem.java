package Nirmal;
import java.util.Scanner;
public class QuoRem 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		a=sc.nextInt();
		b=sc.nextInt();
		int quotient=a/b;
		int rem=a%b;
		System.out.println("Quotient:"+quotient);
		System.out.println("Remainder:"+rem);
	}
	
}
