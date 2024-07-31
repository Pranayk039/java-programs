import java.util.Scanner;
class Extract{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int b=1;
	while(n>1)
	{
	b=n%100;
	System.out.println(b);
	break;
	
	
	}
	
	if(b%2==0)
	{
	System.out.println("even");
	}
	else
	System.out.println("odd");
	
}}
