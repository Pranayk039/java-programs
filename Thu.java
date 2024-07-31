class Thu
{
public static void main(String args[])
{
	int n1=14,n2=20,min=0,h=0;
	if(n1>n2)
	min=n2;
	else
	min=n1;
	int i=min;
	while(i>1)
	{
	if(n1%i==0 && n2%i==0)
	h=i;
	i--;
	}
	System.out.println(h);
	
}
}