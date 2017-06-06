class Products{
String Productname;
int Productprice;

void setproductname(String productname){
Productname = productname;
}
String getproductname(){
return Productname;
}

void setproductprice(int productprice){
Productprice = productprice;
}
int getproductprice(){
return Productprice;
}
}

class Orders extends Products{
String Customername;
int Quantity;

void setcustomername(String customername){
Customername = customername;
}
String getcustomername(){
return Customername;
}

void setquantity(int quantity){
Quantity = quantity;
}
int getquantity(){
return Quantity;
}
}

class Shippedorders extends Orders{
static int shippingprice = 150;

void computeprice(){
System.out.println("customer name is "+ getcustomername());
System.out.println("product name is "+ getproductname());
System.out.println("product price is "+ getproductprice()+" rupees");
System.out.println("product quantity is "+ getquantity());
System.out.println("total price is "+((getproductprice()*getquantity())+shippingprice)+" rupees");
}
}

class EndUser{
public static void main(String[] args){
Shippedorders obj = new Shippedorders();
obj.setcustomername("joey");
obj.setproductname("pizza");
obj.setproductprice(800);
obj.setquantity(3);
obj.computeprice();
}
}