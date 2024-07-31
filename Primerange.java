class Primerange
{
public static void main(String args[])
{
	int i=1,j;
	for(i=1;i<=100;i++)//
	{
        int count=0;
	for(j=1;j<=i;j++)//1<=1
	{
	if(i%j==0)//1%1==0
        {
	count++;//1
        }
	}
        if(count==2)
	System.out.println(i);
}
	
	
}
}