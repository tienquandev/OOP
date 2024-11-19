
package tienquan.test;

import java.util.Scanner;


public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book() {
    }

    
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        Author a =new Author();
        
        System.out.print("Nhap ten sach: ");
        this.name = sc.nextLine();
        System.out.println("");
        
        a.nhap();
        
        System.out.print("Nhap price: ");
        this.price = sc.nextDouble();
        System.out.println("");
        
        System.out.print("Nhap qty: ");
        this.qty = sc.nextInt();
    }

    @Override
    public String toString() {
        Author a =new Author();
        return "Book{" + "name=" + name + ", price=" + price + ", qty=" + qty + '}';
    }
    
    
}
