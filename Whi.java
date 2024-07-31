class Whi
{
public static void main(String args[])
{
	int n=22,i=1,count=0;
	while(i<=n)
	{
		if(n%i==0)
		{
		count++;
		}
		i++;
	}
		
		if(count==2)
		{
		System.out.println("prime number"+ n);
		}
		else
		System.out.println("non prime");
	
}
}