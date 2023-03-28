import java.lang.*;
import java.util.*;
class cuboid
{
    public static void main(String[] args)
    {
        double area,volume,perimeter,length,breadth,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lenght , Breadth , Height = ");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        height=sc.nextDouble();
        area= 2*(length*breadth+length*height+breadth*height);
        volume= length*breadth*height;
        perimeter= 4*length+breadth+height;
        System.out.println("The Area of Cuboid is = " + area);
        System.out.println("The Volume of Cuboid is = " + volume);
        System.out.println("The Perimeter of Cuboid is = " + perimeter);
    }
}
