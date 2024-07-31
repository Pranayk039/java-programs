class Que
{
public static void main(String args[])
{
	int n=12345,temp=n,b=0,smax=0,max=0;
	while(n>0)
	{
	b=n%10;
	if(b%2==0)
	System.out.println(b+2);
	else
	System.out.println(b+1);
	n=n/10;
	}
	
}
}