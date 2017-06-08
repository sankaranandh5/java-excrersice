/*inside a method this keyword is used to represent instance variable 
if both local and instance variable has same name. 
Otherwise inside a method preference goes to local variables.*/
class ex11{
int ivalue;
float fvalue;

ex11(int ivalue,float fvalue){
this.ivalue = ivalue;
this.fvalue = fvalue;
}
public static void main(String[] args){
ex11 obj = new ex11(45,86.56f);
System.out.println(obj.ivalue);
System.out.println(obj.fvalue);
}
}