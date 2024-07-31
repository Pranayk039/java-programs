class Twinprime
{
public static void main(String args[])
{
	int n1=11,n2=12,i=1,c1=0,c2=0;
	while(n1>=1)
	{
		if(n1%i==0)
		c1++;
		i++;
	}
		
	while(n2>=1)
	{
		if(n2%i==0)
		c2++;
		i++;
	}
		if(c1==2&&c2==2)
		{
			if((c1+2)==c2 || (c1-2)==c2)
			System.out.println("co-primes");
		}
		else
			System.out.println("non twin primes");

}
}