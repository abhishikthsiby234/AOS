import java.util.Scanner;
class ComplexAddition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter real part of first number :");
        int a=sc.nextInt();
        System.out.print("enter imaginary part of first number :");
        int b=sc.nextInt();
        System.out.print("enter real part of second number :");
        int c=sc.nextInt();
        System.out.print("enter imaginary part of second number :");
        int d=sc.nextInt();
        int realsum=a+c;
        int imgsum=b+d;
        System.out.println("the sum of complex numbers="+realsum+"+"+imgsum+ "i");
    }
}