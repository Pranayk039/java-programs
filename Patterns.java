import java.util.Scanner;
class Patterns
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int rows=s.nextInt();
	for(int r=1;r<=rows;r++)
	{
		
		for(int c=rows;c>=1;c--)
		{
			if(c==1||r==rows||c==r)
			System.out.print("# ");
			else
			System.out.print("  ");
		}
		System.out.println();

	}
		
		
}
}