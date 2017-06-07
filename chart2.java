class chart2{
static int ivalue;
boolean bvalue;

void instance(){
System.out.println(ivalue);//static variable of same class
System.out.println(chart2.ivalue);//static variable of same class

System.out.println(bvalue);//instance variable of same class

System.out.println(b.dvalue);//static variable of different class

b ref = new b();
System.out.println(ref.fval);//instance variable of different class
}

public static void main(String[] args){
chart2 obj = new chart2();
obj.instance();
}

}

class b{
static double dvalue;
float fval = 4.5f;
}