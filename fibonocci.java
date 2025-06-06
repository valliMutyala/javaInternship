import java.util.*;
class fibonocci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter n value :");
int n=sc.nextInt();
int a=0,b=1,c=0;
if(n==1){
System.out.println("Fiboncci series : "+a);
}
if(n==2){
System.out.println("Fiboncci series : "+a+" "+b);
}
else{
System.out.print("Fiboncci series : "+a+" "+b);
for(int i=1;i<=n-2;i++){
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}
}
