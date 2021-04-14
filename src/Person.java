package JAVA_Project_student.src;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Human{
 public abstract int getAge();
 public abstract String getaddress() ;
 public abstract String getfirstname(); 
 public abstract String getlastname(); 
 public abstract String getPhone_no(); 
 public abstract String getEmail();
 public abstract String getBlood_group() ;
}

 class Person extends Human {
    // name ,address ,phone no,email(auto), age,dob,blood grp, pass(auto) 
    //constructor
    //getter and setter
    public String firstname;
    public String lastname;
    private String address;
    private String phone_no;
    private String email;
    private String blood_group;
    private int age; 
    private int Defaultpasswordlength=10;
    private String password;
    
    public Person( String firstname, String lastname, String address, String phone_no, String email, String blood_group, int age ,String password) {

    // this.firstname = firstname;
    // this.lastname = lastname;
    setName(firstname, lastname);
    this.address = address;
    //this.phone_no = phone_no;
    setPhone_no(phone_no);
    this.email=email;
    this.blood_group= blood_group;
    this.age= age;
    setAge(age);
    this.password = setpassword(Defaultpasswordlength);
    }

    Person(){}

    public Person(String firstname, String lastname, int age) {
        setAge(age);
        setName(firstname, lastname);
    }

    public void setAge(int age){
        if(age<18 || age>60) System.out.println("Age should be greater than 18");
        else
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address= address;
    }
    public String getaddress(){
        return address;
    }
    public void setPhone_no(String phone_no){
        if(phone_no.length()==10 && phone_no.matches("[0-9]+"))
        this.phone_no=phone_no ;
       else System.out.println("Please enter a valid phone number");
    }
    
    public String getfirstname(){
        return firstname;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public void setName(String firstname, String lastname){
        if(firstname.matches("[a-zA-Z]+") && lastname.matches("[a-zA-Z]+")){
            this.firstname = firstname;
            this.lastname = lastname;
        }
        else{
            System.out.println("ENTER A VALID NAME");
        }

    }
    
    public void setEmail(String email) {
        try {
          if (email.length() < 5)
            this.email = null;
    
          String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // email validation
    
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(email);
    
          if (matcher.matches())
            this.email = email; 
          else 
            System.out.println("\nInvalid email passed!");
        } catch (NullPointerException e) {
          System.out.println("\nEmail cannot be null");
        }
      }
  
    public String getPhone_no() {
        return this.phone_no;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    
    public String getBlood_group() {
        return this.blood_group;
    }
    
    public void setBlood_group(String blood_group) {
        if(blood_group.length()==0){
            System.out.println("Blood group cannot be null ");
        }
        this.blood_group = blood_group;
    }
    
    public String setpassword(int length) {         
        String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
           int rand = (int) (Math.random() * passwordset.length());
           password[i] = passwordset.charAt(rand);
        }
        return new String (password);
    }
    
    public String getPassword() {
        System.out.println("Your password for workEmail is :" + password);
        return this.password;
    }

    }