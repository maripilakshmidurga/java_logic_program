// student Managment System

interface Student {
    void CalculateTuitionFee();
    void DisplayInfo();
}

class UnderGraduateStudent implements Student {
    private String Name;
    private int Credits;
    private static final double Cost_Per_Credit = 300.0;

    // Constructor
    public UnderGraduateStudent(String Name, int Credits) {
        this.Name = Name;
        this.Credits = Credits;
    }

    @Override
    public void CalculateTuitionFee() {
        double TuitionFee = Credits * Cost_Per_Credit;
        System.out.println("Undergraduate Student " + Name + " Tuition Fee: Rs. " + TuitionFee);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Undergraduate Student: " + Name);
        System.out.println("Credits: " + Credits);
    }
}

class GraduateStudent implements Student {
    private String Name;
    private double FlatRate;

    // Constructor
    public GraduateStudent(String Name, double FlatRate) {
        this.Name = Name;
        this.FlatRate = FlatRate;
    }

    @Override
    public void CalculateTuitionFee() {
        System.out.println("Tuition Fee for Graduate Student " + Name + ": Rs. " + FlatRate);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Graduate Student: " + Name);
        System.out.println("Flat Rate: Rs. " + FlatRate);
    }
}

class OnlineStudents implements Student {
    private String Name;
    private int NumberOfCourses;
    private double CostPerCourse;

    // Constructor
    public OnlineStudents(String Name, int NumberOfCourses, double CostPerCourse) {
        this.Name = Name;
        this.NumberOfCourses = NumberOfCourses;
        this.CostPerCourse = CostPerCourse;
    }

    @Override
    public void CalculateTuitionFee() {
        double TotalFee = NumberOfCourses * CostPerCourse;
        System.out.println("The total fee for Online Student " + Name + ": Rs. " + TotalFee);
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Online Student: " + Name);
        System.out.println("Number of Courses: " + NumberOfCourses);
        System.out.println("Cost per Course: Rs. " + CostPerCourse);
    }
}

public class StudentInformationSystem {
    public static void main(String args[]) {
        Student underGraduateStudent = new UnderGraduateStudent("Kesav", 15);
        underGraduateStudent.DisplayInfo();
        underGraduateStudent.CalculateTuitionFee();

        System.out.println();

        Student graduateStudent = new GraduateStudent("Prem", 4925);
        graduateStudent.DisplayInfo();
        graduateStudent.CalculateTuitionFee();

        System.out.println();

        Student onlineStudent = new OnlineStudents("Ram", 5, 400);
        onlineStudent.DisplayInfo();
        onlineStudent.CalculateTuitionFee();
    }
}