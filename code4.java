import java.lang.*;
import java.awt.*;
import java.math.*;
import java.util.Scanner;
class code4
{
    public static void main(String[] args)
    {
        double a,b,c,s,area;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the points = ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
         s=(a+b+c)/2d;
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of traingle is = " + area);

    }
}