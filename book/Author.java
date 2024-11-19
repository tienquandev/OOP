
package tienquan.test;

import java.util.Scanner;


public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten tac gia: ");
        this.name = sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap email: ");
        this.email = sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap gender: ");
        this.gender = sc.nextLine().charAt(0);
    }

    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }
    
    
}
