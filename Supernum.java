class Supernum
{
public static void main(String args[])
{
	for(int i=1;i<=1000;i++)
	{
	int n=i,b=0,count=0,sum=0;
	double p=0;
	while(n>0)
	{
	int r=n%10;
	b=b*10+r;
	n/=10;
	}
	while(b>0)
	{
	int r=b%10;
	count++;
	p=Math.pow(r,count);
	sum=sum+(int)p;
	b=b/10;
	}
	n=i;
	if(n==sum)
	System.out.println(i);
	}
}
}