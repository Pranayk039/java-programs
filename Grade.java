class Grade{
public static void main(String args[]){
  double h=56,c=0.9,t=5700;
  if(h>50 && c<0.7 && t>5600)
  System.out.println("grade 10");
  else if(h>50 && c<0.7)
  System.out.println("grade 9");
  else if(c<0.7 && t>5600)
  System.out.println("grade 8");
  else if(h>50 && t>5600)
  System.out.println("grade 7");
  else if(h>50 || c<0.7 || t>5600)
  System.out.println("grade 6");
  else 
  System.out.println("grade 5");
}
}
  