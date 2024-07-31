class De
{
public static void main(String args[])
{
	int n=83,i=1,count=0,j=1;
	while(i<=n)
	{
		if(n%i==0)
		{
		count++;
		}
		i++;
	}
		if(count==2)
		System.out.println("prime");
		else
		System.out.print("non prime");
}
}