public class student extends Person{
private int id;
private int currentyr;
private double cgpa;
private double gpa;
private double amountpaid;
private int attendance;
private String course;

public student(int id,int currentyr,String course,double cgpa, double gpa,double amountpaid,int attendance, 
String name, String address,String phone_no, String email, String blood_group, int age ,String password) {
super(name, address, phone_no, email, blood_group, age, password); 
this.id = id;
this.currentyr = currentyr;
this.course = course;
this.cgpa = cgpa;
this.gpa = gpa;
this.amountpaid = amountpaid;
this.attendance = attendance;
}

public void setcgpa(int cgpa){
    if(cgpa<1) {
    System.out.println("RESULT FAIL");
    }
    else if(cgpa>=1 && cgpa<=4){
        System.out.println("RESULT PASS");
    }
    else{
        System.out.println("NO RESULT");
    }
}

public double getcgpa(){
    return (double)this.cgpa;
}

public void setgpa(int gpa){
    if(gpa<1){
    System.out.println("RESULT FAIL");
    }
    else if(gpa>=1 && gpa<=4){
        System.out.println("RESULT PASS");
    }
    else{
        System.out.println("NO RESULT");
    }
}

public double getgpa(){
    return (double)this.gpa;
}

public void setcurrentyr(int currentyr){
    System.out.println("Current year is " + currentyr);
}

public int getcurrentyr(){
    return (int)currentyr;
}

public void setamountpaid(double amountpaid){
    if(amountpaid== getFees()){
        System.out.println("Fully paid");
    }
    else{
    //double balance = getFees() - amountpaid;
    System.out.println("The amount paid for your course is " + amountpaid + "and amount to be paid is " + balance);
    }
}

public double getamountpaid(){
    return (double) amountpaid;
    
}

public void getattendance(int attendance){
    

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
    this.course = course;
}

public int getAttendance() {
    return this.attendance;
}

public void setAttendance(int attendance) {
    this.attendance = attendance;
}

}






// id(autogenerate), currentyr,course,cgpa ,gpa,paid amt,attendance
//constructor
//getter and setter
// balance payment = fees - paid
