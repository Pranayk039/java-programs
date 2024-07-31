class Tue
{
public static void main(String args[])
{
	int n=5,r=2,i=1,b=1,i2=1,i3=1,d=1,e=1;	
	while(n>=i)
	{
		b=b*i;
		i++;
	}
	while(r>=i2)
	{
		d=d*i2;
		i2++;
	}
	int c=n-r;
	while(c>=i3)
	{
		e=e*i3;
		i3++;
	}
	int f=b/(d*e);
	System.out.println(f);
}
}