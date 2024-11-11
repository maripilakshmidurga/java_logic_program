import java.util.Scanner;
class Studmark{
public static void main(String args[]){
int sno,m,p,c,tot;
String sname;
float avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter student number:");
sno=sc.nextInt();
System.out.println("enter student name:");
sname=sc.next();
System.out.println("enter maths marks");
m=sc.nextInt();
System.out.println("enter physics marks");
p=sc.nextInt();
System.out.println("enter chemistry marks");
c=sc.nextInt();
tot=m+p+c;
System.out.println("student number:"+sno);
System.out.println(" student name:"+sname);
System.out.println(" maths marks:"+m);
System.out.println("physics marks:"+p);
System.out.println("chemistry marks:"+c);
System.out.println("total marks:"+tot);
avg=tot/3;
System.out.println("average marks:"+avg);
}
}