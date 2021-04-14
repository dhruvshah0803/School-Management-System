package JAVA_Project_student.src;

public class BusinessLogic {
    // Calculate the yearly salary of employee
   public double calculateYearlySalary(AdminStaff adminStaff) {
    double yearlySalary = 0;
    yearlySalary = adminStaff.getMonthlySalary() * 12;
    return yearlySalary;
 }
  
 // Calculate the appraisal amount of employee
 public double calculateAppraisal(AdminStaff adminStaff) {
    double appraisal = 0;
      
    if(adminStaff.getMonthlySalary() < 10000){
       appraisal = 500;
    }else{
       appraisal = 1000;
    }
      
    return appraisal;
 }
}
