package zad2;

public class Tester {
    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    private String javaLevel;
    private double salary;

    public Tester(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public Tester(String firstName, String lastName, int yearsOfExperience) {
        this(firstName, lastName, yearsOfExperience, "unknown");
    }

    public Tester(String firstName, String lastName, int yearsOfExperience, String proficiencyInEnglish) {
        this(firstName, lastName, yearsOfExperience, proficiencyInEnglish, 0.0);
    }

    public Tester(String firstName, String lastName, int yearsOfExperience, String javaLevel, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExperience = yearsOfExperience;
        this.javaLevel = javaLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + ", Surname: " + lastName +", " +
                "Уровень знаний джавы: " + javaLevel);
    }

    public void displayInfo(boolean showSalary) {
        displayInfo();
        if (showSalary) {
            System.out.println("Salary: " + salary);
        }
    }

    public void updateExperience(int years) {
        yearsOfExperience += years;
    }

    public void updateExperience(String newExperienceLevel) {
        javaLevel = newExperienceLevel;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void setSalary(double newSalary, double bonus) {
        salary = newSalary + bonus;
    }

    public static void printCompany() {
        System.out.println("Company: КБиП");
    }
}