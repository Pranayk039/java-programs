import java.util.Scanner;
class Lcm
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	int b=0,min=0;
	if(n1>n2)
	min=n2;
	else
	min=n1;
	int i=min;
	while(i>1)	
	{
		if(n1%i==0 && n2%i==0)
		b=i;
		i--;
		
	}
		System.out.print(b);
}
}