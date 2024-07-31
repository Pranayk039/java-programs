class fact
{
public static void main(String args[])
{
	int n=6,i=1,count=0;
	while(i<n)
	{
	if(n%i==0)
	{
	System.out.println("factors of 6 is "+ i);
	count++;
	}
	i++;
	}
	System.out.println(count);
}}