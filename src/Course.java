package JAVA_Project_student.src;

interface CourseSpecialization{
    public abstract String getSpecialization();
}

interface CourseDetails{
   public  abstract double getFees();
    public  abstract String getCourseName();
    public  abstract int getDuration();
}


public class Course implements CourseSpecialization, CourseDetails{
    private String courseName;
    private String specialization;
    public double fees;
    private int duration;
    private long courseId;

    public Course(String courseName, String specialization, double fees, int duration, long courseId) {
        // this.courseName = courseName;
        // this.specialization = specialization;
        setCourseName(courseName);
        setSpecialization(specialization);
        setFees(fees);
        //this.duration = duration;
        setDuration(duration);
        //this.courseId = courseId;
        setCourseId(courseId);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName.matches("[a-zA-Z]+")){
        this.courseName = courseName;
    }
    else System.out.println("Coursename should only contail alphabets");
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        if(specialization.matches("[a-zA-Z]+")){
            this.specialization = courseName;
        }
        else System.out.println("Coursename should only contail alphabets");

    }

    public double getFees() {
        return this.fees;
    }

    public void setFees(double fees) {
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



@Override
    public String toString() {
        return "{" +
            " courseName='" + courseName + "'" +
            ", specialization='" + specialization + "'" +
            ", fees='" + fees + "'" +
            ", duration='" + duration + "'" +
            ", courseId='" + courseId + "'" +
            "}";
    }

    public Course() {
    }

    
}
