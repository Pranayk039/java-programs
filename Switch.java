class Switch{
public static void main(String args[]){

int a=10,b=++a,c=b++;//a=11,b=11,c=11
System.out.println(a++ + b++ + c);//a=11,b=12,c=11
System.out.println(a+b);//a=12,b=13
}}