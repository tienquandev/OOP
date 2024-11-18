
package oop.chuong3.person;


public class Person {
    // Thuoc tinh: 
    private String name;
    private String dob;
    private String pob;
    private char gender;
    private String email;
    private String phone;
    
    // Contructer
    public Person(){
        
    }
    public Person(String name, String dob, String pob, char gender, String email, String phone){
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    
    // Phuong thuc getter, setter
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDob(){
        return dob;
    }
    
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getPob(){
        return pob;
    }
    
    public void setPob(String pob){
        this.pob = pob;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    // Phuong thuc toString
    @Override
    public String toString(){
        return "Name  : " + name + "\n" +
               "DOB   : " + dob + "\n" +
               "POB   : " + pob + "\n" +
               "Gender: " + gender + "\n" +
               "Email : " + email + "\n" +
               "Phone : " + phone;
    }
}
