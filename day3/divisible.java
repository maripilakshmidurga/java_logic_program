import java.util.*;
class Divisible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
int num=sc.nextInt();
if(num%5==0&&num%11==0)
System.out.println("This number is divisible by 5 and 11");
else
System.out.println("This number is not divisible by 5and 11");
}
}