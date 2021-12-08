package lesson9.Lab9_1;

public class MainConstructor {
    public static void main(String[] args){
        Employee employee = new Employee();
        Manager manager = new Manager();
        CEO ceo = new CEO();

        double specialSalary = employee.SalaryCalculator(employee,1);
        double employeeSalary = employee.SalaryCalculator(employee,0);
        double managerSalary = manager.SalaryCalculator(manager, 0);
        double ceoSalary = ceo.SalaryCalculator(ceo, 0);
        double totalSalary = employeeSalary + managerSalary + ceoSalary + specialSalary;
        System.out.println("Calculate money that company has to pay monthly for all employees : " +totalSalary + " Millions");

    }
}
