class Cap
{
public static void main(String args[])
{
	char ch='w';
	if(ch>='a' && ch<='z')
	{
	int b=(int)ch;
	System.out.println(b-32);
	}
	else
	System.out.println((char)b+32);
}
}