
package com.tienquan.product;

// Class cha

import java.util.Scanner;

public class Product {
    // Thuoc tinh product
    protected String id, name;
    protected double price;
    protected int total;
    
    // Contructor khong doi so va co doi so
    public Product() {
    }
    public Product(String id, String name, double price, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = total;
    }
    
    // Phuong thuc getter and setter 
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    
    // Phuong thuc nhap thong tin
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten san pham: ");
        this.name = sc.nextLine();
        System.out.println("");

        System.out.print("Nhap ma san pham: ");
        this.id = sc.nextLine();
        System.out.println("");
               
        System.out.print("Nhap gia san pham: ");
        this.price = sc.nextDouble();
        System.out.println("");
        
        System.out.print("Nhap so luong san pham: ");
        this.total = sc.nextInt();
        System.out.println("");
        
    }
    // Phuong thuc toString
    @Override
    public String toString() {
        return  "----------------\n" + 
                "San pham: " + name +  "\n" +
                "Ma san pham: " + id +  "\n" +
                "Gia ban: " + price +  "\n" +
                "So luong: " + total +  "\n";
    }
    
    
}
