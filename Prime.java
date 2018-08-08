package program;

import java.util.Scanner;

public class Prime
{

	public static void main(String[] args)
	{
		int n,i,flag=1;
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the number");
		n=nu.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("the given number is prime");
		else
			System.out.println("the given number is not prime");
		nu.close();
	}

}
