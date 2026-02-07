package Nirmal;
import java.util.*;
public class Fibbonoci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
		System.out.println(a+""+b+"");
		for(int i=1;i<=10;i++)
		{
			int c=a+b;
			System.out.println(c+"");
			a=b;
			b=c;
		}
	}

}
