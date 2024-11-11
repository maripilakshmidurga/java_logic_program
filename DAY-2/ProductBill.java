import java.util.Scanner;
class ProductBill{
public static void main(String args[]){
int prono;
String proname;
float procost;
float proquan;
double totbill;
Scanner sc=new Scanner(System.in);
System.out.println("enter product number:");
prono=sc.nextInt();
System.out.println("enter product name:");
proname=sc.next();
System.out.println("enter product cost:");
procost=sc.nextFloat();
System.out.println("enter product quantity:");
proquan=sc.nextFloat();
totbill=procost*proquan;
System.out.println("product number:"+ prono);
System.out.println(" product name:"+proname);
System.out.println(" product cost:"+procost);
System.out.println("product  quantity:"+proquan);
System.out.println("total bill:"+totbill);
}
}
