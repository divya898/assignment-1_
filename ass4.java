import java.util.*;
class ass4
{
public static void main(String[] args)
{
double l,b,h,area;
System.out.println("enter a length to get the area of cubiod");
Scanner sc = new Scanner(System.in);
l=sc.nextDouble();
System.out.println("enter a b breath to get the area of cubiod");
Scanner ab = new Scanner(System.in);
b=ab.nextDouble();
System.out.println("enter a hight to get the area of cubiod");
Scanner cd = new Scanner(System.in);
h=cd.nextDouble();
area=(l*b+b*h+h*l)*2;
System.out.println(area);
}
}        