package JAVA_Project_student;

import java.util.*;
// public student(int id,int currentyr,String course,double cgpa, double gpa,double amountpaid,double attendance, 
// String firstname,String lastname, String address,String phone_no, String email, String blood_group, int age ,String password) 

// public Course(String courseName, String specialization, double fees, int duration, long courseId)

// public Person( String firstname, String lastname, String address, String phone_no, String email, String blood_group, int age ,String password)
// public teacher(String teacher_id, String subject, int experience, long course_id)
public class Main {
    public static void main(String[] args){
// option menu -- student teacher course
final int choice;
System.out.println("You belong to which category ?");
Scanner sc = new Scanner(System.in);
System.out.println("1. Faculty member");
System.out.println("2. Student ");
System.out.println("3. Course");
System.out.println("4. Exit");
choice = sc.nextInt();

while(true){
     int flag=0;
switch (choice) {
    case 1:
    int tn;
    System.out.println("Enter no of faculty members you want to create");
    tn=sc.nextInt();
    for(int i=1;i<=tn;i++) {
        System.out.println("\n");
         System.out.println("Enter details of faculty" + i);
         System.out.println("\n");
        teacher[] trr; 
        trr = new teacher[tn+1]; 
       
        System.out.println("Enter Faculty ID : ");
        String teacher_id = sc.next();

        System.out.println("Enter Firstname");
        String firstname = sc.next();

        System.out.println("Enter Lastname");
        String lastname = sc.next();
        
        System.out.println("Enter your mobile number");
        String phone_no = sc.next(); 
        
        System.out.println("Enter your current functional email id : ");
        String email= sc.next();
        
        System.out.println("Enter Subject");
        String subject = sc.next();

        System.out.println("Enter Experience ");
        int experience = sc.nextInt();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter Faculty course ID");
        long course_id = sc.nextLong(); 

        System.out.println("Enter address : ");
        String address = sc.next();       
                                      
        System.out.println("Enter your blood group : ");
        String blood_group = sc.next();
        
         String workemail = firstname+"."+lastname+"@nmims.edu.in";
         System.out.println("Your  generated work email is : "+ workemail);

         String password = "password";
        
        trr[tn] = new teacher( teacher_id, subject,experience, course_id, firstname,lastname, address, phone_no,  email,  blood_group, age, password);
        trr[tn].setEmail(workemail);
        System.out.println("Do you want to confirm your data [Y/N]");

        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch== 'y'){
            System.out.println("Faculty ID : " + trr[tn].getTeacher_id());
            System.out.println("Firstname :" + trr[tn].getfirstname());
            System.out.println("Lastname : " + trr[tn].getlastname());
            System.out.println("Mobile number : " + trr[tn].getPhone_no());
            System.out.println("Age :" + trr[tn].getAge());
            System.out.println("Address: " + trr[tn].getaddress());
            System.out.println("Your Subject is : " + trr[tn].getSubject());
            System.out.println("Experience is : " + trr[tn].getExperience());
            System.out.println("Your working email :" +trr[tn].getEmail());
            System.out.println("Blood group : " + trr[tn].getBlood_group());

        }
      }

        break;
        
    case 2:
    int n;
    System.out.println("Enter no of students you want to create");
    n=sc.nextInt();
    for(int i=1;i<=n;i++) {
        System.out.println("\n");
         System.out.println("Enter details of Student" + i);
         System.out.println("\n");
        student[] arr; 
        arr = new student[n+1]; 
       
        System.out.println("Enter Student ID : ");
        int id = sc.nextInt();
        System.out.println("Enter Firstname");
        String firstname = sc.next();
        System.out.println("Enter Lastname");
        String lastname = sc.next();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your mobile number");
        String phone_no = sc.next(); 
        System.out.println("Enter address : ");
        String address = sc.next();                                      // DOES NOT CHECK FOR SPACES IN ADDRESS
        System.out.println("Enter your current year : ");
        int currentyr = sc.nextInt();
        System.out.println("Enter your previous semesters cgpa : ");
        double cgpa = sc.nextDouble();
        System.out.println("Enter your gpa");
        double gpa = sc.nextDouble();
        System.out.println("Enter your attendance in percentage : ");
        double attendance = sc.nextDouble();
        System.out.println("Enter Course Name");
        String course = sc.next();
        System.out.println("Enter your current functional  email id : ");
        String email= sc.next();
        System.out.println("Enter your blood group : ");
        String blood_group = sc.next();
         String workemail = firstname+"."+lastname+"@nmims.edu.in";
         System.out.println("Your  generated work email is : "+ workemail);
         String password = "password";
        
        
        arr[i] = new student(id, currentyr,course, cgpa, gpa,attendance, firstname, lastname, address, phone_no, email,blood_group, age,password);
        arr[i].setEmail(workemail);
        System.out.println("Do you want to confirm your data [Y/N]");

        char ch = sc.next().charAt(0);
        if(ch == 'Y' ){
            System.out.println("Student ID : " + arr[i].getId());
            System.out.println("Firstname :" + arr[i].getfirstname());
            System.out.println("Lastname : " + arr[i].getlastname());
            System.out.println("Age :" + arr[i].getAge());
            System.out.println("Mobile number : " + arr[i].getPhone_no());
            System.out.println("Address: " + arr[i].getaddress());
            System.out.println("Current Year : " + arr[i].getcurrentyr());
            System.out.println("Previous semesters cgpa : " + arr[i].getcgpa());
            System.out.println("Your gpa : " + arr[i].getgpa());
            System.out.println("Your attendance  : " + arr[i].getAttendance());
            System.out.println("Your course name : " + arr[i].getCourse());
            System.out.println("Your working email :" +arr[i].getEmail());
            System.out.println("Blood group : " + arr[i].getBlood_group());
        }
        else break;
      }
        break;
    case 3:
    int cn;
    System.out.println("Enter no of courses you want : ");
    cn=sc.nextInt();
    for(int i=1;i<=cn;i++) {
        System.out.println("\n");
         System.out.println("Enter details of the course" + i);
         System.out.println("\n");
        Course[] crr; 
        crr = new Course[cn];
        System.out.println("Course id is" + crr[cn].getCourseId()); 
        long courseId = sc.nextLong();
         System.out.println("Your course name is : " +crr[cn].getCourseName());
         String courseName=sc.next();
        System.out.println("Your specialization" + crr[cn].getSpecialization());
        String specialization=sc.next();
        System.out.println("Fees to be paid for this course is " + crr[cn].getFees());
        double fees=sc.nextDouble();
        System.out.println("Your duration for the Course  is" + crr[cn].getDuration());
        int duration = sc.nextInt();
        
        
        crr[i] = new Course(courseName,specialization,fees,duration,courseId);

        System.out.println("Do you want to confirm your data [Y/N]");

        char ch = sc.next().charAt(0);
        if(ch == 'Y' ){
            System.out.println("Course ID : " + crr[cn].getCourseId());
            System.out.println("Course name :" + crr[cn].getCourseName());
            System.out.println("specialization : " + crr[cn].getSpecialization());
            System.out.println("Fees :" + crr[cn].getFees());
            System.out.println("Duration   : " + crr[cn].getDuration());
        }
        else break;
        } 
        
        
     
        break;
    case 4:
    flag=1;
        break;
    
    default:
        flag=1;
        break;
}
if(flag==1) break;
}

// switch for creating type senu object 
// student a[i] = new student
// same for course and teacher

        // Person P = new Person("Dhruv","shah","lsojs","1234567890","dhhk@gmail.com","B+",25,"558");
        // P.WorkEmail();
        // P.setpassword(10);
        // P.getPassword();
        
        
        // student S = new student(01,3,"English",3.94,3.56,88,"Drumil","Kacheria","pedder road","9820700140","dhh@gmail.com","O+ve",22,"bcd"); 
        // S.getBlood_group();
        // S.getAttendance();

        // System.out.println("Drumil Kacherias blood group is " + S.getBlood_group());
        //  teacher T = new teacher("I001","English",5,1,"Drumil","Kacheria","pedder road","9820700140","dhh@gmail.com","O+ve",22,"bcd");
        //  System.out.println("This" + T.getfirstname() + T.getExperience());
        //  Course C = new Course("English","Literature",1300.00,4,1);
        // System.out.println("The course id is " + C.getCourseId());
        sc.close();
    }
}
