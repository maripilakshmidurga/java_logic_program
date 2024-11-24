interface Employee
{
 void calculatePay();
 void displayInfo();
}


 class Fulltimeemployee implements Employee
{
 private String name;
 private double annualsalary;
 public Fulltimeemployee(String name,double annualsalary)
 {
  this.name=name;
  this.annualsalary=annualsalary;
 }

 @Override
  public void calculatePay()
  {
   double monthlysalary=annualsalary/12;
   System.out.println("Monthly pay for Full time employee" + name + "is" +monthlysalary);
  }
 
 @Override
  public void displayInfo()
  {
   System.out.println("Full-Time employee" +name);
   System.out.println("Annual salary is "+ "$"+annualsalary);
  }
}


class Parttimeemployee implements Employee
{
 private String name;
 private double hourlywage;
 private int hoursworked;
 public Parttimeemployee(String name,double hourlywage,int hoursworked)
 {
  this.name=name;
  this.hourlywage=hourlywage;
  this.hoursworked=hoursworked;
 }

  @Override
   public void calculatePay()
   {
    double pay=hourlywage*hoursworked;
    System.out.println("Weekly pay for part time employee "+name +"is" +pay);
   }

  @Override
   public void displayInfo()
   {
    System.out.println("Part time employee: "+name);
    System.out.println("Hourly wage: " +hourlywage); 
    System.out.println("Hours worked: " +hoursworked);
   }
}


class Contractemployee implements Employee
{
 private String name;
 private double contractfee;
 public Contractemployee(String name,double contractfee)
 {
  this.name=name;
  this.contractfee=contractfee;
 }

  @Override
   public void calculatePay()
   {
    System.out.println("Contractor "+name +"pay for one project is "+contractfee);
   }

  @Override
   public void displayInfo()
   {
    System.out.println("Contractor name: "+name);
    System.out.println("Contract fee for project: "+contractfee);
   }
}
public class Employee1
{
 public static void main(String args[])
 {
  Employee Fulltimeemployee=new Fulltimeemployee("Vasu",400000.00);
  Fulltimeemployee.displayInfo();
  Fulltimeemployee.calculatePay();

  Employee Parttimeemployee=new Parttimeemployee("Manu",250.00,40);
  Parttimeemployee.displayInfo();
  Parttimeemployee.calculatePay();

  Employee Contractemployee=new Contractemployee("Raju",300000.00);
  Contractemployee.displayInfo();
  Contractemployee.calculatePay();
 }
}