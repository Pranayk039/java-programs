class Reverse
{
public static void main(String args[])
{
	int n=1234,rev=1,b=0;
	while(n>=0)
	{
		b=n%10;
		rev=rev*10 + b;
		n=n/10;
	}
		System.out.println("rev");
}
}