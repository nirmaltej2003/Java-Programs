package Nirmal;
import java.util.Scanner;
public class NumPow 
{
	public static void main(String[] args) 
	{
		int n,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		System.out.println("Enter the Power");
		p=sc.nextInt();
		double result=Math.pow(n, p);
		System.out.println(n+"^"+p+"="+result);
	}
}
