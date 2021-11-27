package lesson7.Lab;

public class Employee {
    private double countEmployee;
    private double salaryEmployee;
    private double supportSalaryEmployee;

    public Employee(double countEmployee, double salaryEmployee, double supportSalaryEmployee) {
        this.countEmployee = countEmployee;
        this.salaryEmployee = salaryEmployee;
        this.supportSalaryEmployee = supportSalaryEmployee;
    }

    public double getCountEmployee() {
        return countEmployee;
    }

    public void setCountEmployee(double countEmployee) {
        this.countEmployee = countEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public double getSupportSalaryEmployee() {
        return supportSalaryEmployee;
    }

    public void setSupportSalaryEmployee(double supportSalaryEmployee) {
        this.supportSalaryEmployee = supportSalaryEmployee;
    }
}
