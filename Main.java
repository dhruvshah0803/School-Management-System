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
    
        break;
        
    case 2:
    int n;
    System.out.println("Enter no of students you want to create");
    n=sc.nextInt();
    for(int i=0;i<n;i++) {
        student[] arr; 
        arr = new student[n]; 
       
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
        arr[i].WorkEmail(); 
        String password = arr[i].setpassword(8);
        
        arr[i] = new student(id, currentyr,course, cgpa, gpa,attendance, firstname, lastname, address, phone_no, email,blood_group, age,password);
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
