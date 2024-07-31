class Perfect{
public static void main(String args[]){
  int n=6,i=1,sum=0;
  while(i<n)
  {
	if(n%i==0)
	{
	sum=sum+i;
	System.out.println(i +"factors of"+ n);
	}	
	i++;
	
  }
  	System.out.println(sum);
	if(sum==n)
	{
	System.out.println("perfect number");
	}
	else 
	{
	System.out.println("not a perfect number");
	}
		
}
}