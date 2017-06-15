abstract class sample{
static String str = "how you doing?";

static{
System.out.println("of class sample");
}
}

 class test extends sample{
static int i = 15;
static{
	System.out.println("of class test");
 }
}
 class main{
public static void main(String[] args){
	System.out.println(sample.str);
	System.out.println(test.str);
	System.out.println(test.i);
 }}
