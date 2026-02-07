package Nirmal;
import java.util.*;
public class SI 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float p,t,r,si;
		System.out.println("Enter Principle");
		p=sc.nextFloat();
		System.out.println("Enter Time Period");
		t=sc.nextFloat();
		System.out.println("Enter Rate of Interest");
		r=sc.nextFloat();
		si=(p*t*r)/100;
		System.out.println("Simple Interest:"+si);
	}
}
