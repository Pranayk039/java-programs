import java.util.Scanner;
class Patt

{

public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter rows and column");
	int rows=s.nextInt();int cols=s.nextInt();
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c>r;c--)
		{
		System.out.print(" ");
		}
		int a=1;
		for(int c=1;c<=r;c++)
		{
		
		int p=a*a;
		System.out.print(p );
		a++;
		}
		System.out.println("");
	}
}
}