class example{
public void student (){
System.out.println("name : valli");
System.out.println("Roll : 634");
System.out.println("Branch : CST");
}
}
class details extends example{
public void personal(){
System.out.println("fathername : Krishna");
System.out.println("Mothername : Varalakshmi");
}
public void add(int a,int b){
System.out.println(a+b);
}
public void add(int a,int b,int c){
System.out.println(a+b+c);
}
public void add(double a,double b){
System.out.println(a+b);
}
}
class inherit extends details{
public void personal(){
System.out.println("fathername : Krishna123");
System.out.println("Mothername : Varalakshmi123");
}
}
class print
{
public static void main(String args[]){
inherit obj=new inherit();
obj.student();
obj.personal();
obj.add(3,4);
obj.add(3.0,4.0);
}
}
