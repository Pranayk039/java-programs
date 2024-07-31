class Automatic
{
public static void main(String args[])
{
	int n=76,temp=n,count=0;
	while(n>0)
	{
	count++;
	n/=10;
	}
	int sqr=(int)Math.pow(temp,2);
	int p=sqr%(int)Math.pow(10,count);
	if(temp==p)
	System.out.println("auto");
}
}
