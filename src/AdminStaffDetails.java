package JAVA_Project_student.src;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdminStaffDetails {

   BusinessLogic businessLogic = new BusinessLogic();
   //AdminStaff adminStaff = new AdminStaff();
   AdminStaff adminStaff = new AdminStaff("Tom","Holland",43,8000);

   //test to check appraisal
   @Test
   public void testCalculateAppriasal() {
      // adminStaff.setName("Tom");
      // adminStaff.setAge(43);
      // adminStaff.setMonthlySalary(8000);
      AdminStaff adminStaff = new AdminStaff("Tom","Holland",43,8000);
      
      double appraisal = businessLogic.calculateAppraisal(adminStaff);
      assertEquals(500, appraisal, 0.0);
   }

   // test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
      AdminStaff adminStaff = new AdminStaff("Tom","Hiddelston",33,8000);
      
      double salary = businessLogic.calculateYearlySalary(adminStaff);
      assertEquals(96000, salary, 0.0);
   }

   public void testYearSalryEmp2() {
   //  adminStaff.setName("Jim");
   //  adminStaff.setAge(32);
   //  adminStaff.setMonthlySalary(-8000);
   AdminStaff adminStaff = new AdminStaff("Jim","Holland",32,-8000);
      
    double salary = businessLogic.calculateYearlySalary(adminStaff);
    assertEquals(-96000, salary, 0.0);
   }
}


