import java.util.Scanner;
class Patterns1
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int rows=s.nextInt();
	for(int r=rows;r>=1;r--)
	{
		for(int c=rows;c>=1;c--)
		{
			if(r==rows||c==r)
			System.out.print("# ");
			else
			System.out.print("  ");
			for(int c1=2;c1>r;c++)
			{
			if(r==rows||c==r)
			System.out.print("# ");
			else
			System.out.print("  ");
			}
			
		}
		
			
		System.out.println();
	}
}
}