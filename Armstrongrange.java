class Armstrongrange
{
public static void main(String args[])
{
	for(int n=1;n<=10000;n++)
	{
	int temp=n,count=0,sum=0;
	while(temp>0)
	{
	int b=temp%10;
	temp/=10;
	count++;
	}
	temp=n;
	while(temp>0)
	{
	int b=temp%10;
	double p=Math.pow(b,count);
	sum=sum+(int)p;
	temp=temp/10;
	}
	if(sum==n)
	System.out.println(n);
}
}
}