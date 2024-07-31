class Pat
{

public static void main(String args[])
{
	int rows=4,cols=4;
	for(int r=1;r<=rows;r++)
	{
	for(int c=1;c<=cols;c++)
	{
	int a=r+c-1;
	if(a%2!=0)
	{
	System.out.print("0 ");}
	else
	System.out.print(a +" ");
	
	}
	
	
	System.out.println();
	}
}
}