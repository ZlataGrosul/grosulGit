package zad2;

public class App {
    public static void main(String[] args) {
        Tester tester = new Tester("Zlata", "Grosul", 3, "Junior", 6000.0);

        tester.displayInfo(true);
        tester.updateExperience(2);
        tester.updateExperience("Senior");
        tester.setSalary(8200.0);
        tester.setSalary(9200.0, 300.0);
        tester.displayInfo(true);
        Tester.printCompany();
    }
}
