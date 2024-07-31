class Automatic1
{
public static void main(String args[])
{
	for(int i=1;i<=1000;i++)
	{
	int n=i,temp=n,count=0;
	while(n>0)
	{
	count++;
	n/=10;
	}
	 int p=(int)Math.pow(temp,2);
	int power=p%(int)Math.pow(10,count);
	if(temp==power)
	System.out.println(i);
	}
}
}
