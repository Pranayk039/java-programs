class Palindronerange
{
public static void main(String args[])
{
        
	for(int i=1;i<=1000;i++)
	{
		int temp=i;//1
                int b=0;
		for(;temp!=0;)//1>0
		{
		int r=temp%10;//11
		b=b*10+r;//11
		temp=temp/10;
                }
       
		if(b==i)
		System.out.println(i);
	
}
}
}