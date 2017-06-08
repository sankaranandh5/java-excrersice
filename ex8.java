/* Zero parameterized constructor supports static initialization alone*/
class ex8{
int ival;
double dval;
ex8(){ //zero prameterized constructor
ival = 15;//static initialization
dval = 8.9;//static initialization
}
public static void main(String[] args){
ex8 obj = new ex8();
System.out.println(obj.ival);
System.out.println(obj.dval);

ex8 obj2 = new ex8();
System.out.println(obj.ival);
System.out.println(obj.dval);
}
}