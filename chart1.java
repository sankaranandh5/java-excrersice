class chart1{
	boolean bval;
static int i =10;
public static void main(String[] args){
System.out.println(i);
i=15;
System.out.println(chart1.i);

System.out.println(b.ival);

chart1 ref = new chart1();
System.out.println(ref.bval);

b obj = new b();
System.out.println(obj.dval);

}
}

class b{
	double dval;
static int ival;
}