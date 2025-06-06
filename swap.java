import java.util.*;
class swap{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a value ");
int a=sc.nextInt();
System.out.println("enter b value ");
int b=sc.nextInt();
System.out.println("a and b values before swapping "+a+" " +b);
int temp=a;
a=b;
b=temp;
System.out.println("a and b values after swapping "+a+" "+b);
}
}