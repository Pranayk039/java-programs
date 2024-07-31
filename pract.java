class pract
{
public static void main(String args[])
{
	char ch='H';
	int b=(int)ch;
	if(b>=90 && b<=122)
	{
	b=b-32;
	System.out.println((char)b);
	}
	else
	{ 
	int s=b+32;
	char d=(char)s;
	System.out.println(d);

}}}