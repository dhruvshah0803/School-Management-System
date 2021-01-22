public class Person{
    // name ,address ,phone no,email(auto), age,dob,blood grp, pass(auto) 
    //constructor
    //getter and setter
public String name;
private String address;
private String phone_no;
private String email;
private String blood_group;
private int age;
private String password;



public Person( String name, String address, String phone_no, String email, String blood_group, int age ,String password) {
this.name = name;
this.address = address;
this.phone_no = phone_no;
this.email=email;
this.blood_group= blood_group;
this.age= age;
this.password=password;
}
public void setAge(int age){
    if(age<18) System.out.println("Age should be greater than 18");
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
    this.phone_no=phone_no ;
}

public void setName(String name){
    this.name= name;
}
public String getName(){
    return name;
}
public String getPhone_no() {
    return this.phone_no;
}

public String getEmail() {
    return this.email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getBlood_group() {
    return this.blood_group;
}

public void setBlood_group(String blood_group) {
    this.blood_group = blood_group;
}

public String getPassword() {
    return this.password;
}

public void setPassword(String password) {
    this.password = password;
}
}