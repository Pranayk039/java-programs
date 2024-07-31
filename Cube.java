import java.util.Scanner;
class Cube
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),j=3,b=1;
	for(j=3;j>0;j--)
	{
	b*=n;
	}
	System.out.println(b);
}
}