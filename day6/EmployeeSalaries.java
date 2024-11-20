import java.util.TreeSet;
public class EmployeeSalaries {
    private TreeSet<Integer> salaries;    
    public EmployeeSalaries() {
        salaries = new TreeSet<>();
    }
    public void addSalary(int salary) {
        salaries.add(salary);
        System.out.println("Salary " + salary + " added.");
    }
    public void findLowestSalary() {
        if (salaries.isEmpty()) {
            System.out.println("No salaries available.");
        } else {
            System.out.println("Lowest Salary: " + salaries.first());
        }
    }
    public void findHighestSalary() {
        if (salaries.isEmpty()) {
            System.out.println("No salaries available.");
        } else {
            System.out.println("Highest Salary: " + salaries.last());
        }
    }

    public void displaySalariesInRange() {
        if (salaries.isEmpty()) {
            System.out.println("No salaries available.");
            return;
        }
        System.out.println("Salaries in the range of 30,000 to 70,000:");
        for (Integer salary : salaries.subSet(30000, true, 70000, true)) {
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        EmployeeSalaries employeeSalaries = new EmployeeSalaries();       
        employeeSalaries.addSalary(50000);
        employeeSalaries.addSalary(60000);
        employeeSalaries.addSalary(70000);
        employeeSalaries.addSalary(30000);
        employeeSalaries.addSalary(120000);
        employeeSalaries.addSalary(20000);   
        employeeSalaries.findLowestSalary();
        employeeSalaries.findHighestSalary();       
        employeeSalaries.displaySalariesInRange();
    }
}
