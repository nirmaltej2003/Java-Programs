package Nirmal;
import java.util.Scanner;
public class PrimeNum 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime Num is");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}
}
