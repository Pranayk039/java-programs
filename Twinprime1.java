class Twinprime
{
public static void main(String args[])
{
	int n1=10,n2=13,i=1,i2=1,c1=0,c2=0;
	while(n1>=i)
	{
		if(n1%i==0)
		{
		c1++;
		}
		i++;
	}
		if(c1==2)
		{
		
	while(n2>=i2)
	{
		if(n2%i2==0)
		{
		c2++;
		}
		i2++;
	}
		if(c1==2&&c2==2)
		{
			if(n1-n2==2 || n2-n1==2)
			System.out.println("co-primes");
			else
			System.out.println("not co-primes");
		}
		}
		else
			System.out.println("non twin primes");

}
}