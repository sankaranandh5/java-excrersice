class ex9{
boolean bval;
float fval;

ex9(boolean bvalue,float fvalue){
bval = bvalue;
fval = fvalue;
}

public static void  main(String[] args){
ex9 obj = new ex9(true,5.3f);
System.out.println(obj.bval);
System.out.println(obj.fval);

ex9 obj2 = new ex9(false,99.97f);
System.out.println(obj2.bval);
System.out.println(obj2.fval);
}
}