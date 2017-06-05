class ex5{
static int ivalue;
static int getint(){
return ivalue;
}
static int setint(int ival){
ivalue = ival;
return 0;
}
public static void main(String[] args){

setint(50);
int value = getint();
System.out.println(value);

}
}