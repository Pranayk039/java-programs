class One{
public static void main(String args[])
{
	int n=100,i=1,sum=0,count=0;float p=1f;
	while(i<=n)
	{
	if(i%2==0)
	{
	System.out.println(i +"even");
	sum+=i;
	p*=i;
	count++;
	}
	i++;
	}
	System.out.println(sum +"sum");
	System.out.println(count);
	System.out.println("p"+p );
}}