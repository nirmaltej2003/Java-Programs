package Nirmal;
import java.util.Scanner;
public class Largestoftwo
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>=b)
		{
			System.out.println("A is the Largest");
		}
		else
		{
			System.out.println("B is the Largest");
		}
	}
}
