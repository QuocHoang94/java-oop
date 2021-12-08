package lesson9.Lab9_1;

public class SalaryEmployee {

   public static double totalSalary;
   public SalaryEmployee(){}
   protected double countSalary(int countNumber,int salaryNumber ,int supportSalary){
      return countNumber*(salaryNumber+supportSalary);
   }
   protected double SalaryCalculator(Object employeeObj,int quantity) {
      if(employeeObj.getClass().equals(Employee.class)){
         totalSalary = countSalary(7,30,5);
      }
      if(employeeObj.getClass().equals(Employee.class) && quantity != 0){
         totalSalary = countSalary(quantity,35,10);
      }
      if(employeeObj.getClass().equals(Manager.class)){
         totalSalary = countSalary(2,50,3);
      }
      if(employeeObj.getClass().equals(CEO.class)){
         totalSalary = countSalary(1,100,0);
      }
      return totalSalary;
   }

}
