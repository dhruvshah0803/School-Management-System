package JAVA_Project_student;

public class Person {
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
private String SchoolSuffix = "nmims.edu.in"; 
private int Defaultpasswordlength=10;
private String password;



public Person( String firstname, String lastname, String address, String phone_no, String email, String blood_group, int age ,String password) {
this.firstname = firstname;
this.lastname = lastname;
this.address = address;
this.phone_no = phone_no;
this.email=email;
this.blood_group= blood_group;
this.age= age;
this.password = setpassword(Defaultpasswordlength);
}
public void setAge(int age){
    if(age>18 && age<60) System.out.println("Age should be greater than 18");
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
    if(phone_no.length()!=10)
    this.phone_no=phone_no ;
}

public String getfirstname(){
    return firstname;
}

public String getlastname(){
    return lastname;
}

public void setName(String firstname, String lastname){
    if(firstname.length()==0 || lastname.length()==0 )  {
        System.out.println("Firstname or lastname cannot be equal to null");
    }
    else{
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

public void WorkEmail(){                                    // does not check for same names
    String WorkEmail = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+ SchoolSuffix;
    System.out.println("Your WorkEmail is :  " + WorkEmail);
}

public void setEmail(String email){ 
    this.email=email;  // does not check for same names
    System.out.println(email);
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