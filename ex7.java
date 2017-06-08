/*default constructor implicitly added by compiler when programmer not adds any explicitly. 
It does not supports Static or Dynamic initialization*/
class ex7{
int i = 10;
static boolean b1;
static int j = 15;
public static void main(String[] args){
ex7 obj = new ex7();
System.out.println(obj.i*j);
System.out.println(!b1);
b1 = true;
System.out.println(!b1);
}
}