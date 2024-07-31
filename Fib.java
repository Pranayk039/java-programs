import java.util.Scanner;
class Fib
{
public static void main(String args[])
{
	int n1=1,a=0,b=1,c=0,i=10;
	while(n1<i)
	{
	a=b;
	b=c;
	c=a+b;
	System.out.println(c);
	n1++;
	}
	
}
}