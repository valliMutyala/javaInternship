import java.util.*;
class reverseString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string : ");
String str=sc.nextLine();
String s="";
for(int i=str.length()-1;i>=0;i--){
s=s+str.charAt(i);
}
System.out.println("reversed String : " +s);
}
}
