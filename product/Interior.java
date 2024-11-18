
package com.tienquan.product;

// Lop con

import java.util.Scanner;

public class Interior extends Product{
    // Thuoc tinh rieng cua lop con interior
    private String corlor, shape;
    
    // Contructer
    public Interior() {
        super();
    }
    public Interior(String corlor, String shape, String id, String name, double price, int total) {
        super(id, name, price, total);
        this.corlor = corlor;
        this.shape = shape;
    }
    
    // Phuong thuc getter and setter
    public String getCorlor() {
        return corlor;
    }
    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    
    // Phuong thuc nhap thong tin
    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        
        super.nhapThongTin();
        
        System.out.print("Nhap mau cua san pham: ");
        this.corlor = sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap hinh dang cua san pham: ");
        this.shape = sc.nextLine();
 
    }
    
    // Phuong thuc toString
    @Override
    public String toString() {
        return  super.toString() +
                "Mau sac: " + corlor +  "\n" +
                "Hinh dang: " + shape +  "\n" +
                "----------------\n";
    }

    
}
