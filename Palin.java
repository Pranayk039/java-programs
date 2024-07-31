
class Palin
{
public static void main(String args[])
{
	
	int n=121;
	int rev=0,i=1,b=0,c=0,st=0,f=n;
	while(n>0)
	{
		b=n%10;
		rev=rev*10+b;
		n=n/10;
	}
System.out.println(rev);
	if(f==rev)

	System.out.println("palindrone");
	else
	System.out.println("not palindrone");
		
}
}