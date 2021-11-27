package lesson7.Lab;

public class Manager {
    private double countManager;
    private double salaryManager;
    private double supportSalaryManager;

    public Manager(double countManager, double salaryManager, double supportSalaryManager) {
        this.countManager = countManager;
        this.salaryManager = salaryManager;
        this.supportSalaryManager = supportSalaryManager;
    }

    public double getCountManager() {
        return countManager;
    }

    public void setCountManager(double countManager) {
        this.countManager = countManager;
    }

    public double getSalaryManager() {
        return salaryManager;
    }

    public void setSalaryManager(double salaryManager) {
        this.salaryManager = salaryManager;
    }

    public double getSupportSalaryManager() {
        return supportSalaryManager;
    }

    public void setSupportSalaryManager(double supportSalaryManager) {
        this.supportSalaryManager = supportSalaryManager;
    }
}
