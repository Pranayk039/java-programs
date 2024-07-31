class Fizzbuzz
{
public static void main(String args[])
{
	int n=1,count=1,sum=0;
	while(n<100)
	{
		count++;
		if(n%3==0&&n%5==0)
		System.out.println(n +"fizz buzz");
		

		sum=sum+n;
		n++;
		
		
	}
		
		System.out.println(sum);
		
}
}