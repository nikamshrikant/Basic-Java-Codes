import java.util.*;
class calculator
{
    public static void main(String[] args)

{
   double num1,num2,add,sub,mul,divd;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your two numbers : ");
   num1=sc.nextDouble();
   num2=sc.nextDouble();
   add=num1+num2;
   sub=num1-num2;
   mul=num1*num2;
   divd=num1/num2;
   System.out.println("Two numbers addtition is      : " + add);
   System.out.println("Two numbers substraction is   : " + sub);
   System.out.println("Two numbers multiplication is : " + mul);
   System.out.println("Two numbers division is       : " + divd);
}
}