package JAVA_Project_student.src;



public class Student extends Person {                              // Inheritance
    private int id;
    private int currentyr;
    private double cgpa;
    private double gpa;
    private double attendance;
    private String course;
 

    public Student(int id,int currentyr,String course,double cgpa, double gpa,
    double attendance, 
    String firstname,String lastname, String address,String phone_no, String email, String blood_group, int age ,String password) {
    super(firstname,lastname,address, phone_no, email, blood_group, age,password); 
    setId(id);   
    setcurrentyr(currentyr);
    setCourse(course);
    setcgpa(cgpa);
    setgpa(gpa);
    setAttendance(attendance);
    }
    
public  Student (){}

    public void setcgpa(double cgpa){
        if(cgpa<1.0) {
        System.out.println("RESULT FAIL");
        }
        else if(cgpa>=1.0 && cgpa<=4.0){
            this.cgpa=cgpa;
            System.out.println("RESULT PASS");
        }
        else{
            System.out.println("NO RESULT");
        }
    }
    
    public double getcgpa(){
        return (double)this.cgpa;
    }
    
    public void setgpa(double gpa){
        if(gpa<1.0){
        System.out.println("RESULT FAIL");
        }
        if(gpa>=1.0 && gpa<=4.0){
            this.gpa=gpa;
            System.out.println("RESULT PASS");
        }

    }
    
    public double getgpa(){
        return (double)this.gpa;
    }
    
    public void setcurrentyr(int currentyr){
        if(currentyr>=2018 && currentyr<=2024){
        System.out.println("Current year " + currentyr);
        this.currentyr=currentyr;
    }
    else{
        System.out.println("Please enter a valid year");
    }
    }
    
    public int getcurrentyr(){
        return (int)currentyr;
    }
        
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {   
        this.id = id;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public void setCourse(String course) {
        if(course.matches("[a-zA-Z]+")){
            this.course = course;
        }
        else System.out.println("Coursename should only contail alphabets");
    
    }
    

    public double getAttendance() {
        return (double)this.attendance;
    }
    
    public void setAttendance(double attendance) {
        if(attendance>=80.0){
            System.out.println("Dear Student , your attendance is greater than 80.0%.");
            this.attendance = attendance;
    }
        else{
            System.out.println("Dear Student , your attendance is less than 80.0%.");
        }
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", currentyr='" + currentyr + "'" +
            ", cgpa='" + cgpa + "'" +
            ", gpa='" + gpa + "'" +
            ", attendance='" + attendance + "'" +
            ", course='" + course + "'" +
            "}";
    }
   
    
    
}


