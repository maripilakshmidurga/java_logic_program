interface Employee {
    void CalculatePay();
    void DisplayInfo();
}

class FullTimeEmployee implements Employee {
    private String Name;
    private double AnnualSalary;

    // Constructor
    public FullTimeEmployee(String Name, double AnnualSalary) {
        this.Name = Name;
        this.AnnualSalary = AnnualSalary;
    }

    @Override
    public void CalculatePay() {
        double MonthlyPay = AnnualSalary / 12;
        System.out.println("Monthly Pay for Full-Time Employee " + Name + ": Rs. " + MonthlyPay);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Full-Time Employee: " + Name);
        System.out.println("Annual Salary: Rs. " + AnnualSalary);
    }
}

class PartTimeEmployee implements Employee {
    private String Name;
    private double HourlyWage;
    private int HoursWorked;

    // Constructor
    public PartTimeEmployee(String Name, double HourlyWage, int HoursWorked) {
        this.Name = Name;
        this.HourlyWage = HourlyWage;
        this.HoursWorked = HoursWorked;
    }

    @Override
    public void CalculatePay() {
        double TotalPay = HourlyWage * HoursWorked;
        System.out.println("Weekly Pay for Part-Time Employee " + Name + ": Rs. " + TotalPay);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Part-Time Employee: " + Name);
        System.out.println("Hourly Wage: Rs. " + HourlyWage);
        System.out.println("Hours Worked: " + HoursWorked);
    }
}

class ContractEmployee implements Employee {
    private String Name;
    private double ContractFee;

    // Constructor
    public ContractEmployee(String Name, double ContractFee) {
        this.Name = Name;
        this.ContractFee = ContractFee;
    }

    @Override
    public void CalculatePay() {
        System.out.println("Contract Pay for Contract Employee " + Name + ": Rs. " + ContractFee);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Contract Employee: " + Name);
        System.out.println("Contract Amount: Rs. " + ContractFee);
    }
}

public class EmployeeManagementSystem {
    public static void main(String args[]) {
        Employee fullTimeEmployee = new FullTimeEmployee("Kesav", 70015);
        fullTimeEmployee.DisplayInfo();
        fullTimeEmployee.CalculatePay();

        System.out.println();

        Employee partTimeEmployee = new PartTimeEmployee("Ram", 17, 35);
        partTimeEmployee.DisplayInfo();
        partTimeEmployee.CalculatePay();

        System.out.println();

        Employee contractEmployee = new ContractEmployee("Shiv", 170015);
        contractEmployee.DisplayInfo();
        contractEmployee.CalculatePay();
}
      }