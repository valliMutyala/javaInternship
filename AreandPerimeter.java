import java.util.*;
class AreandPerimeter{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st side :");
int a=sc.nextInt();
System.out.println("Enter 2nd side :");
int b=sc.nextInt();
System.out.println("Enter 3rd side :");
int c=sc.nextInt();
System.out.println("Enter height :");
int h=sc.nextInt();
double area=(b*h)/2;
System.out.println("Area of a triangle" +area);
double perimeter=a+b+c;
System.out.println("Perimeter of a triangle" +perimeter);
}
}