package Nirmal;
import java.util.Scanner;
public class swap 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a:"+a);
		System.out.println("After Swapping b:"+b);
	}
}
