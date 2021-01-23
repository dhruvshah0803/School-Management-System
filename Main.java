package JAVA_Project_student;

// public student(int id,int currentyr,String course,double cgpa, double gpa,double amountpaid,double attendance, 
// String firstname,String lastname, String address,String phone_no, String email, String blood_group, int age ,String password) 

// public Course(String courseName, String specialization, double fees, int duration, long courseId)

// public Person( String firstname, String lastname, String address, String phone_no, String email, String blood_group, int age ,String password)
// public teacher(String teacher_id, String subject, int experience, long course_id)
public class Main {
    public static void main(String[] args){
        Person P = new Person("Dhruv","shah","lsojs","1234567890","dhhk@gmail.com","B+",25,"558");
        P.WorkEmail();
        P.setpassword(10);
        P.getPassword();
        
        
        student S = new student(01,3,"English",3.94,3.56,88,"Drumil","Kacheria","pedder road","9820700140","dhh@gmail.com","O+ve",22,"bcd"); 
        S.getBlood_group();
        S.getAttendance();

        System.out.println("Drumil Kacherias blood group is " + S.getBlood_group());
         teacher T = new teacher("I001","English",5,1,"Drumil","Kacheria","pedder road","9820700140","dhh@gmail.com","O+ve",22,"bcd");
         System.out.println("This" + T.getfirstname() + T.getExperience());
         Course C = new Course("English","Literature",1300.00,4,1);
        System.out.println("The course id is " + C.getCourseId());
    }
}
