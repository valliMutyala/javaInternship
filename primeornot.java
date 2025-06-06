import java.util.*;
class primeornot{
static boolean check(int n){
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}}
if(count==2){
return true;
}
else{
return false;
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
Boolean result=check(n);
System.out.println(result);
}
}


