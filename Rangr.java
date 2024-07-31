class Range
{
public static void main(String args[])
{
	int n=1,i=1,b=1,j=3;
	while(n<=100)
	{
	while(i<=j)
	{
	b=b*i;
	if(b>100)
	System.out.println(b);
	i++;
	}
	n++;
	}
}
}