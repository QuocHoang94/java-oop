package lesson7.Lab;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static double count(double number, double salary, double support){
        return number*(salary + support);
    }

//    private static double totalSalary(List<Employee> employee,List<Manager> manager,List<Ceo> ceo) {
//    }
    private static double totalSalary(List<Employee> employee, Manager countSalaryManagers, Ceo countSalaryCeo) {
        double totalSalary = 0;
//        return totalSalary;
        double totalSalaryEmployee = 0;
        double higherEmployee = 0;
        double Employee = 0;
        double totalSalaryManager = 0;
        double totalSalaryCeo = 0;

        for(Employee i : employee){
            if(i.getCountEmployee() < 3){
                higherEmployee = count(i.getCountEmployee(),i.getSalaryEmployee(),i.getSupportSalaryEmployee());
            }
            else{
                Employee = count(i.getCountEmployee(),i.getSalaryEmployee(),i.getSupportSalaryEmployee());
            }
            totalSalaryEmployee = higherEmployee + Employee;
        }
//        totalSalaryEmployee = count(countSalaryEmployees.getCountEmployee(),countSalaryEmployees.getSalaryEmployee(),countSalaryEmployees.getSupportSalaryEmployee());
//        for (Employee i : employees) {
//             totalSalaryEmployee = count(i.getCountEmployee(),i.getSalaryEmployee(),i.getSupportSalaryEmployee());
//            totalSalary = totalSalary + monthlyEmployeeSalary;
//        }
        totalSalaryManager = count(countSalaryManagers.getCountManager(),countSalaryManagers.getSalaryManager(),countSalaryManagers.getSupportSalaryManager());
        totalSalaryCeo = count(countSalaryCeo.getCountCeo(),countSalaryCeo.getSalaryCeo(),countSalaryCeo.getSupportSalaryCeo());
        return totalSalary = totalSalaryEmployee + totalSalaryManager + totalSalaryCeo;
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

//        List<Manager> manager = new ArrayList<>();
//        List<Ceo> ceo = new ArrayList<>();
//        Employee Yan = new Employee(1, 3);
//        Employee Yun = new Employee(2, 6);
//        Employee Yi = new Employee(3, 9);
        Employee Yan = new Employee(1,30,15);
        Employee countSalaryEmployees = new Employee(7, 30, 5);
        Manager countSalaryManagers = new Manager(2,50,30);
        Ceo countSalaryCeo = new Ceo(1, 100, 0);
        employees.add(countSalaryEmployees);
        employees.add(Yan);
//        employees.add(Yan);
//        Yan.setSupportSalaryEmployee(15);
//        manager.add(countSalaryManagers);
//        ceo.add(countSalaryCeo);
//        employees.add(Yan);
//        employees.add(Yun);
//        employees.add(Yi);

        double totalSalary = SalaryCalculator.totalSalary(employees,countSalaryManagers,countSalaryCeo);
//        double totalSalary = SalaryCalculator.totalSalary(employees);

        System.out.println("Calculate money that company has to pay monthly for all employees \n" + totalSalary);
    }


}
