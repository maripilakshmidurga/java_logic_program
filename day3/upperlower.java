import java.util.Scanner;
class UpperLower
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char ch=sc.next().charAt(0);
if(ch>='a'&&ch<='z')
{
System.out.println("This is a lowercase alphabet:");
}
else
{
System.out.println("This is a uppercase alphabet:");
}
}
}