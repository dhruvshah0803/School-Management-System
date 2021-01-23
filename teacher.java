package JAVA_Project_student;

public class teacher {
    // id,salary,subject,experience,
//constructor
//getter and setter
// extra reward system
private String teacher_id;
private String subject;
private int experience;
private long course_id;


public teacher(String teacher_id, String subject, int experience, long course_id) {
this.teacher_id = teacher_id;
this.subject = subject;
    this.experience = experience;
    this.course_id = course_id;
}


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
