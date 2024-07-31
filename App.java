class App{
public static void main(String args[]){
String name="pranay";
char sec='a';
int n1=87,n2=98,n3=0;
double percent=(n1+n2+n3/300)*100;
System.out.println(name);
System.out.println("section ="+sec);

if(percent>80)
System.out.println("first class");
else if(percent<60&&percent>80)
System.out.println("second class");
else if(percent<40&&percent>60)
System.out.println("third class");
else if(percent<40)
System.out.println("fail");
}}
