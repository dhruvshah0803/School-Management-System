package JAVA_Project_student.src;

public class Teacher extends Person {                  // Inheritance

private String teacher_id;
private String subject;
private int experience;
private long course_id;


public Teacher (String teacher_id, String subject, int experience, long course_id,String firstname,String lastname, String address,String phone_no, String email, String blood_group, int age ,String password) {
    super(firstname,lastname,address, phone_no, email, blood_group, age,password); 
this.teacher_id = teacher_id;
this.subject = subject;
    this.experience = experience;
    this.course_id = course_id;
}

public Teacher(){} 

public String getTeacher_id() {
    return this.teacher_id;
}

public void setTeacher_id(String teacher_id) {
    this.teacher_id = teacher_id;
}

public String getSubject() {
    return this.subject;
}

public void setSubject(String subject) {
    this.subject = subject;
}

public int getExperience() {
    return this.experience;
}

public void setExperience(int experience) {
    this.experience = experience;
}

public long getCourse_id() {
    return this.course_id;
}

public void setCourse_id(long course_id) {
    this.course_id = course_id;
}

}