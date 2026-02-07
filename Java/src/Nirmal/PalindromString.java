package Nirmal;
import java.util.Scanner;
public class PalindromString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.println("Enter a String");
		s1=sc.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
