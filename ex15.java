/*only the instance members can be inherited.
  Static members cannot be inheried. */
abstract class sample{
static String string(){
	String str = "how you doing?";
	return str;
}
static{
System.out.println("of class sample");
}
}

 class test extends sample{
static int ival(){
	int i = 15;
    return i;
}
static{
	System.out.println("of class test");
 }
}
 class main{
public static void main(String[] args){
	System.out.println(sample.string());
	System.out.println(test.string());
	int j = test.ival();
	System.out.println(j);

 }}
