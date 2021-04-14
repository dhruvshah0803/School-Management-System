package JAVA_Project_student.src;
// ------------------------------------------Association--------------------------------------------- 
// ------------------------------------------Composition--------------------------------------------- 
// College has staff
public class College {

private Student theStudent;
private Teacher theTeacher;
private Course theCourse;

public College (Student theStudent, Teacher theTeacher, Course theCourse) {
    this.theStudent = theStudent;
    this.theTeacher = theTeacher;
    this.theCourse = theCourse;

}
    @Override
    public String toString() {
        return "{" +
            " theStudent='" + getTheStudent() + "'" +
            ", theTeacher='" + getTheTeacher() + "'" +
            ", theCourse='" + getTheCourse() + "'" +
            "}";
    }

College(){}

    public Student getTheStudent() {
        return this.theStudent;
    }

    public void setTheStudent(Student theStudent) {
        this.theStudent = theStudent;
    }

    public Teacher getTheTeacher() {
        return this.theTeacher;
    }

    public void setTheTeacher(Teacher theTeacher) {
        this.theTeacher = theTeacher;
    }

    public Course getTheCourse() {
        return this.theCourse;
    }

    public void setTheCourse(Course theCourse) {
        this.theCourse = theCourse;
    }
}
