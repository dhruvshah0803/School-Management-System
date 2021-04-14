package JAVA_Project_student.src;

public class SportsStudents extends Student {
    private String sportsname ;
    private String play_duration;
    private int  score;

    public SportsStudents(int id,int currentyr,String course,double cgpa, double gpa, double attendance, String firstname,String lastname, String address,String phone_no, String email, String blood_group, int age ,String password,String sportsname, String play_duration, int score) 
    {
        super(id, currentyr, course, cgpa,  gpa,  attendance,  firstname, lastname,  address, phone_no,  email,  blood_group,  age , password);
        //this.sportsname = sportsname;
        setScore(score);
        setPlay_duration(play_duration);
        //this.play_duration = play_duration;
        //this.score = score;
        setSportsname(sportsname);
    }

    public String getSportsname() {
        return this.sportsname;
    }

    public void setSportsname(String sportsname) {
        this.sportsname = sportsname;
    }

    public String getPlay_duration() {
        return this.play_duration;
    }

    public void setPlay_duration(String play_duration) {
        this.play_duration = play_duration;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }




}
