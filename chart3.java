class chart3{
static void staticmethod(){
System.out.println("static method of same class");
}
void instancemethod(){
System.out.println("instance method of same class");
}
public static void main(String[] args){

staticmethod();//static method--> same class

chart3 obj = new chart3();
obj.instancemethod();//Instance method-->  same class

b.staticmethod2();//static method--> different class

b obj1 = new b();
obj1.instancemethod2();//Instancemethod--> different class
}
}

class b{
static void staticmethod2(){
System.out.println("static method of different class");
}
void instancemethod2(){
System.out.println("instance method of different class");
}
}
