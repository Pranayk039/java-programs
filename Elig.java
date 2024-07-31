class Elig
{
public static void main(String args[])
{
	String marriage="no",g="f";int age1=20;
	if(marriage=="no" && g=="m" && age1>=30)
	System.out.println("eligible");
	else if(marriage=="yes")
	System.out.println("eligible");
	else if(marriage=="no" && g=="f" && age1>=25)
	System.out.println("eligible");
	else
	System.out.println("not eligible");

}
}
