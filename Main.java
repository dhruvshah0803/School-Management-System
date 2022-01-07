package JAVA_Project_student.src;
import java.util.*;



public class Main {


    public static void main(String[] args){

int choice;
System.out.println("------------------------------------------------------");
System.out.println("Welcome to NMIMS student management system.");
System.out.println("------------------------------------------------------");

Scanner sc = new Scanner(System.in);


while(true){
int flag=0;
System.out.println("Please select the action that you wish to perform:");
System.out.println("1. Faculty member");
System.out.println("2. Student ");
System.out.println("3. Course");
System.out.println("4. College");
System.out.println("5. Exit");
choice = sc.nextInt();
switch (choice) {
    case 1:                 //----------------Faculty--------------------------------------
    int tn;
    System.out.println("Enter no of faculty members you want to create");
    tn=sc.nextInt();
    for(int i=1;i<=tn;i++) {
        System.out.println("\n");
         System.out.println("Enter details of faculty" + i);
         System.out.println("\n");
        Teacher[] trr; 
        trr = new Teacher[tn+1]; 
       
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
        
        trr[tn] = new Teacher( teacher_id, subject,experience, course_id, firstname,lastname, address, phone_no,  email,  blood_group, age, password);
        trr[tn].setEmail(workemail);

        System.out.println("-----------------DATA-------------------");

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

        break;
        
         //---------------------------STUDENTS------------------------



    case 2:              
    int n;
    System.out.println("Enter no of students you want to create");
    n=sc.nextInt();
    Student[] arr; 
    arr = new Student[n+1]; 
    for(int i=1;i<=n;i++) {
int id=0;
String firstname = null;
String lastname = null;
int age = 0;
String phone_no = null;
String address = null;
int currentyr= 0;
double cgpa = 0.0;
 double gpa = 0;
double attendance =0;
String course = null;
String email = null;
String blood_group = null;
        System.out.println("\n");
         System.out.println("Enter details of Student" + i);
         System.out.println("\n");
    

        System.out.println("Enter Student ID : ");
        id = sc.nextInt();
        System.out.println("Enter Firstname");
         firstname = sc.next();
        System.out.println("Enter Lastname");
         lastname = sc.next();
        System.out.println("Enter your age : ");
         age = sc.nextInt();
        System.out.println("Enter your mobile number");
         phone_no = sc.next(); 
        System.out.println("Enter address : ");
         address = sc.next();                                      // DOES NOT CHECK FOR SPACES IN ADDRESS
        System.out.println("Enter your current year : ");
         currentyr = sc.nextInt();
        System.out.println("Enter your previous semesters cgpa : ");
         cgpa = sc.nextDouble();
        System.out.println("Enter your gpa");
         gpa = sc.nextDouble();
        System.out.println("Enter your attendance in percentage : ");
         attendance = sc.nextDouble();
        System.out.println("Enter Course Name");
         course = sc.next();
        System.out.println("Enter your current functional  email id : ");
         email= sc.next();
        System.out.println("Enter your blood group : ");
         blood_group = sc.next();
         String workemail = firstname+"."+lastname+"@nmims.edu.in";
         System.out.println("Your  generated work email is : "+ workemail);
         String password = "password";


        arr[i] = new Student(id, currentyr,course, cgpa, gpa,attendance, firstname, lastname, address, phone_no, email,blood_group, age,password);
        arr[i].setEmail(workemail);

if( arr[i].getId()==0 || arr[i].getfirstname()==null || arr[i].getlastname()==null || arr[i].getaddress()==null || arr[i].getgpa()==0.0 || arr[i].getPhone_no()==null){
System.out.println("\n SORRY YOU CAN NOT ELIGIBLE TO BE REGISTERED IN THE DATABASE PLEASE CHECK YOUR ENTRIES AGAIN  \n");
}
else{
        System.out.println("-----------------DATA-------------------");
            try {
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
        } catch(NullPointerException e) {
            System.out.println("You are not eligible to continue");
        }
    }
      }
        break;
        

//----------------------------COURSES---------------------



    case 3:                    
    int cn=0;
    System.out.println("Enter no of courses you want : ");
    cn=sc.nextInt();

    Course[] crr; 
    crr = new Course[cn+1];

    
    for(int i=1;i<=cn;i++) {
        int courseId=0;
        String courseName=null;
        String specialization=null;
        double fees=0;
        int duration=0;

       
        System.out.println("\n");
         System.out.println("Enter details of the course" + i);
         System.out.println("\n");
        System.out.println("Enter Course ID:");
         courseId = sc.nextInt(); 
        System.out.println("Enter course name:");
         courseName=sc.next();
         System.out.println("Enter specialization");
          specialization=sc.next();
        System.out.println("Enter Fees");
         fees=sc.nextDouble();
        System.out.println("Enter Duration (in hours)");
         duration = sc.nextInt();
         crr[i] = new Course(courseName,specialization,fees,duration,courseId);
      

        System.out.println("-----------------DATA-------------------");
if( crr[i].getCourseId()==0 || crr[i].getCourseName()==null || crr[i].getSpecialization()==null || crr[i].getFees()==0.0 || crr[i].getDuration()==0){
    System.out.println("This course is not eligible to be entered in the database");
}
else {
    System.out.println("Course ID : " + crr[i].getCourseId());
    System.out.println("Course name :" + crr[i].getCourseName());
    System.out.println("specialization : " + crr[i].getSpecialization());
    System.out.println("Fees :" + crr[i].getFees());
    System.out.println("Duration   : " + crr[i].getDuration());
} 


} 

        break;
    case 4:
    //Student(id, currentyr,course, cgpa, gpa,attendance, firstname, lastname, address, phone_no, email,blood_group, age,password);
    Student s1 = new Student(321,2019,"Science",2.9,3.4,85,"Dhruv","Shah","Boulevard avenue", "9820156630","abcd@gmail.com","A+",19,"aaaddd");
    Teacher t1 = new Teacher("2554","Maths",5,2548,"Ravi","Shastri","Evershine Tower","9852015575","Dhaod@gmail.com","A+",28,"aaddce");
    //Teacher( teacher_id, subject,experience, course_id, firstname,lastname, address, phone_no,  email,  blood_group, age, password)
    Course c1 = new Course("SNS","EXTC",450000.00,24,25478);
    //Course(courseName,specialization,fees,duration,courseId);
    // College c = new College();
    College c = new College(s1,t1,c1);
    c.toString();

        break;

        case 5:
        flag=1;
            break;
    
    default:
        flag=1;
        break;
}
if(flag==1) break;
}


        sc.close();
    }
}
