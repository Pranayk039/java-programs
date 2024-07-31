class P
{
public static void main(String args[])
{
	for(int n=1;n<=100;n++)
	{
	int i=1,count=0;
	while(n>=i)
	{
	if(n%i==0)
	{
	count++;
	}
	i++;
	}
	if(count==2)
	System.out.println(n);
}}
}