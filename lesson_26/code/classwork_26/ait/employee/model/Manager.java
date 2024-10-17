package classwork_26.ait.employee.model;

public class Manager extends Employee {
  // Manager: base + grade*hours
  //- SalesManager: salesValue * percent
  //- Worker: grade*hours
  //- создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:

    private double baseSalary;
    private int grade;

    public Manager(int id, String name, String secondName, double hours, double baseSalary, int grade) {
        super(id, name, secondName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade*hours;
        return ensureSalary(salary);// check min of
    }
}
