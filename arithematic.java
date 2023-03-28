import java.util.*;
import java.awt.*;
import java.lang.*;
class arithematic
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
       float c=(float)a/b;
       float r=(float)a%b;
        System.out.println("the division is = " + c);
        System.out.println("the mod result is = " + r);
    }
}