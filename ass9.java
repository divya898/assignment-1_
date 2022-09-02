import java.util.*;
class ass9{
public static void main(String[] arge)
{
double r,h,vol,pi=3.14;
System.out.println("enter the radius of cylinder to get the vol");
Scanner sc = new Scanner(System.in);
r=sc.nextDouble();
System.out.println("enter the height of cylinder to get the vol");
Scanner ab = new Scanner(System.in);
h=ab.nextDouble();
vol=pi*r*r*h;
System.out.println(vol); 
}
}