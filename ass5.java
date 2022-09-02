import java.util.*;
class ass5
{
public static void main(String[] args)
{
double l,r,area,pi=3.14;
System.out.println("enter a radious to get the curved surface area of cone");
Scanner sc = new Scanner(System.in);
r=sc.nextDouble();
System.out.println("enter a length to get the curved surface area of cone");
Scanner ab = new Scanner(System.in);
l=ab.nextDouble();
area=pi*r*l;
System.out.println(area);
}
}        