public class Course{
    // course name , specialization, fees, duration,course id, 
    // return sem = duration /2
    private String courseName;
    private String specialization;
    private int fees;
    private int duration;
    private long courseId;

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

    public int getFees() {
        return this.fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

}