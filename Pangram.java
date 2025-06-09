import java.util.*;
class Pangram {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("enter input :");
String s = sc.nextLine();
String str=s.toLowerCase();
HashMap<Character,Boolean>hm=new HashMap<>();
for(char ch:str.toCharArray()){
if(Character.isLetter(ch)){
hm.put(ch,true);
}
}
if(hm.size()==26){
System.out.println("it is a pangram");
}
else{
for(char c='a';c<='z';c++){
if(!hm.containsKey(c)){
System.out.print(c+" ");
}
}
}}}

