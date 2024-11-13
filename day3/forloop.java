import java.util.Scanner;
class Forloop{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,i,f;
System.out.println("Enter a num to table:");
n=s.nextInt();
for(i=1;i<=10;i++){
f=n*i;
System.out.println(n+" x "+i+" = " + f);

}
}
}