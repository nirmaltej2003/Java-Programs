package Nirmal;
import java.util.Scanner;
public class Traingle 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s1,s2,s3;
		System.out.println("Enter s1,s2 and s3");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		int s=(s1+s2+s3)/2;
		int area=(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area:"+area);
	}
}
