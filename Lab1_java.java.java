import java.util.*;

class Quadratic
{
 public static void main(String args[])
  {
   int a,b,c;
   double d,r,r1,r2;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the values of a,b and c");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();    
   if(a==0)
   {
    System.out.println("It is not a Quadratic Equation!");
   }
   else
   {
    d=b*b-4*a*c;
    if(d==0)
    {
     r=-b/(2*a);
     System.out.println("The roots are real and equal");
     System.out.println("Root = "+r);
    }
    else if(d>0)
    {
     r1=(-b+Math.sqrt(d))/(2*a);
     r2=(-b-Math.sqrt(d))/(2*a);
     System.out.println("The roots are real and distinct");
     System.out.println("R1 = "+r1+" R2 = "+r2);
    }
    else
    {
     System.out.println("Sorry! There are no real solutions. The roots are imaginary.");
     r1=-b/(2*a);
     r2=Math.sqrt(Math.abs(d))/(2*a);
     System.out.println("R1 = "+r1+"+i"+r2+"R2 = "+r1+"-i"+r2);
    }
   }
   }
}