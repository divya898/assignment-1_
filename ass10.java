import java.util.*;
class ass10{
public static void main(String[] args)
{
double pi=3.14,r,vol;
System.out.println("enter the radious of hemisphere to get the volume");
Scanner sc = new Scanner(System.in);
r=sc.nextDouble();
vol = (2.0/3.0)*pi*(r*r*r);
System.out.println(vol); 
}
}