package Nirmal;
import java.util.Scanner;
public class Leap 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		if(n%4==0 && n!=100 || n%400==0 )
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}
