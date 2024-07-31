class Triangle
{
public static void main(String args[])
{
	int rows=10;
for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=rows;c++)
		{
			if(r==rows||r+c==rows+1)
			System.out.print("# ");
			else
			System.out.print("  ");
			
		}
			for(int c1=rows;c1>=1;c1--)
		{
			if(r==rows||r+c1==rows+1)
			System.out.print("# ");
			else
			System.out.print("  ");
		}
		System.out.println();
	}
}
}