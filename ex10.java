/*parameterized constructor supporting Static and Dynamic initialization */
class ex10{
boolean bval;
float fval;

ex10(boolean bvalue,float fvalue){
bval = bvalue;//Dynamic initialization
fval = fvalue;//Dynamic initialization
}

public static void  main(String[] args){
ex10 obj = new ex10(true,5.3f);
System.out.println(obj.bval);
System.out.println(obj.fval);

ex10 obj2 = new ex10(false,99.97f);
System.out.println(obj2.bval);
System.out.println(obj2.fval);
}
}

class second{
boolean bval;
float fval;

second(boolean bvalue,float fvalue){
bval = true;//static initialization
fval = 78.6f;//static initialization
}

public static void  main(String[] args){
second obj = new second(true,5.3f);
System.out.println(obj.bval);
System.out.println(obj.fval);

second obj2 = new second(false,99.97f);
System.out.println(obj2.bval);
System.out.println(obj2.fval);
}
}