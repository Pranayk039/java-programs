class ifelse{
public static void main(String args[]){
  int n=85;
  char ch='d';
	if(ch>='A'&&ch<='Z')
	System.out.println("upper case");
	else if(ch>='a'&&ch<='z')
	System.out.println("Lower case");
	else if(ch>=0&&ch<=9)
	System.out.println("number");
	else
	System.out.println("symbol");
}}
