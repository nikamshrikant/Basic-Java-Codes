import java.lang.*;
import java.awt.*;
import java.util.Scanner;
class code3
{
    public static void main(String[] args)
    {
        double base;
        double height;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base & Height : ");
        base=sc.nextDouble();
        height=sc.nextDouble();
        area=1d/2d*base*height;
        System.out.println("the area is = " + area);
    }
}