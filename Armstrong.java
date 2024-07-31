import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=s.nextInt(),temp=n,count=0,b=0,sum=0;
	while(n>0)
	{
	b=n%10;
	count++;
	n=n/10;
	}
	n=temp;
	while(n>0)
	{
	b=n%10;
	int power=(int)Math.pow(b,count);
	sum=sum+power;
	n=n/10;	
	}
	if(sum==temp)
	System.out.println("armstrong");
	else
	System.out.println("not a armstrong");
}
}