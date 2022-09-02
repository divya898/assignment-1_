import java.util.*;
class ass6{
public static void main(String[] arge)
{
double pi=3.14,r,vol;
System.out.println("enter the radious of sphere to get the volume");
Scanner sc = new Scanner(System.in);
r=sc.nextDouble();
vol=(4.0/3.0)*pi*(r*r*r);
System.out.println(vol); 
}
}