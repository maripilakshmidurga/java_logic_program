// exception Handling
class ArthException {
int a, b, c;
void Divide() {
try {
a=10;
b=0;
c=a/b;

System.out.println("The Divison Value is:"+c);
}
catch (ArithmeticException ae) {

System.out.println("The Divison Error is Occuried");
//System.out.println("The Divison Error is Occuried"+ae.getMessage);
System.out.println("The Divison Error is Occuried"+ae);
}
}
}
class Expe {
public static void main(String args[]) {
ArthException a1 = new ArthException ();
a1.Divide();
}
} {
int a, b, c;
void Divide() {
try {
a=10;
b=0;
c=a/b;

System.out.println("The Divison Value is:"+c);
}
catch (ArithmeticException ae) {

System.out.println("The Divison Error is Occuried");
//System.out.println("The Divison Error is Occuried"+ae.getMessage);
System.out.println("The Divison Error is Occuried"+ae);
}
}
}
class Expe {
public static void main(String args[]) {
ArthException a1 = new ArthException ();
a1.Divide();
}
}