import java.util.Scanner;
class Evvodd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("enter number");
	int i=1;
	while(n>i)
	{
		if(n%2==0){
		n=n/2;
		System.out.println(n);}
		else{
		n=(3*n)+1;
		System.out.println(n);}
	}
}
}