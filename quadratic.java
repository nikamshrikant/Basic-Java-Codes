import java.lang.*;
import java.util.*;
import java.math.*;
class quadratic
{
    public static void main(String[] args)
    {
        double a,b,c,r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 points = ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        r1= (- b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2= (-b- Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("the roots are = " + r1 +" "+ r2);
    }
}