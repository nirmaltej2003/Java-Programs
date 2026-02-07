package Nirmal;
import java.util.Scanner;
public class Swapwithouttemp 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a:"+a);
		System.out.println("After Swapping b:"+b);
	}
}
