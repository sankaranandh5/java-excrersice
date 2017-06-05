class chart4{
static void first(){
System.out.println("staic method of same class");
}
void second(){
System.out.println("instance method of same class");
}
void first1(){
	chart4.first();
	b.first();
	chart4 ref1 = new chart4();
	ref1.second();
	b ref2 = new b();
	ref2.first1();

}	
public static void main(String[] args){
	chart4 ref = new chart4();
	ref.first1();
	
}
}

class b{
static void first(){
System.out.println("staticmethod of different class");
}
void first1(){
System.out.println("instance method of diff class");
}
}
