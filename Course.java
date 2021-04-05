package JAVA_Project_student;

public class Course {
    private String courseName;
    private String specialization;
    public double fees;
    private int duration;
    private long courseId;

    public Course(String courseName, String specialization, double fees, int duration, long courseId) {
        this.courseName = courseName;
        this.specialization = specialization;
        this.fees = fees;
        //this.duration = duration;
        setDuration(duration);
        this.courseId = courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getFees() {
        return this.fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        if(duration<20 || duration >150){
            System.out.println("Duration is invalid");
        }
        else{
        this.duration = duration;}
    }

    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

}
