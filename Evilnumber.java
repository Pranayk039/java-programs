class Evilnumber
{
public static void main(String args[])
{
	for(int i=1;i<=1000;i++)
	{
	int n=i,r=0,sum=0;
	int p=(int)Math.pow(n,2);
	while(p>0)
	{
	r=p%10;
	sum=sum+r;
	p=p/10;
	} 
	if(sum==n)
	System.out.println(i);
}
}
}