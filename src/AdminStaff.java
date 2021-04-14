package JAVA_Project_student.src;


public class AdminStaff extends Person{
  // private String name;
   private double monthlySalary;
   // private int age;

    public AdminStaff(String firstname, String lastname, String address, String phone_no, String email,
         String blood_group, int age, String password) {
      super(firstname, lastname, address, phone_no, email, blood_group, age, password);
      
   }
   public AdminStaff(String firstname, String lastname , int age , double monthlySalary){
      super(firstname, lastname, age);
      setMonthlySalary( monthlySalary);

   }
public AdminStaff(){}

  
    
   //  /**
   //  * @return the name
   //  */
     
   //  public String getName() {
   //     return name;
   //  }
     
   //  /**
   //  * @param name the name to set
   //  */
     
   //  public void setName(String name) {
   //     this.name = name;
   //  }
     
    /**
    * @return the monthlySalary
    */
     
    public double getMonthlySalary() {
       return monthlySalary;
    }
     
    /**
    * @param monthlySalary the monthlySalary to set
    */
     
    public void setMonthlySalary(double monthlySalary) {
       this.monthlySalary = monthlySalary;
    }
     
   //  /**
   //  * @return the age
   //  */
   //  public int getAge() {
   //     return age;
   //  }
     
   //  /**
   //  * @param age the age to set
   //  */
   //  public void setAge(int age) {
   //     this.age = age;
   //  }
 }
