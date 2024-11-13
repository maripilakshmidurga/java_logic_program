import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number,i;
System.out.println("please enter the maximum integer value:");
number =sc.nextInt();
for(i = number; i >= 1; i--)
{
System.out.println(i+"\t");
}
}
}