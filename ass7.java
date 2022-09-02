import java.util.*;
class ass7
{
public static void main(String[] args)
{
double l,b,h,vol;
System.out.println("enter a length to get the volume of cubiod");
Scanner sc = new Scanner(System.in);
l=sc.nextDouble();
System.out.println("enter a b breath to get the volume of cubiod");
Scanner ab = new Scanner(System.in);
b=ab.nextDouble();
System.out.println("enter a hight to get the volume of cubiod");
Scanner cd = new Scanner(System.in);
h=cd.nextDouble();
vol=l*b*h;
System.out.println(vol);
}
}        