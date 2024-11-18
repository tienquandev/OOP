
package com.tienquan.caodang;

import java.util.Scanner;

public abstract class Nguoi {
    protected String hoTen, ngaySinh, diaChi;

    public Nguoi() {
    }
    public Nguoi(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap ngay sinh: ");
        this.diaChi = sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap dia chi: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("");
    }
    public abstract double tinhDiem();

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + "\n" +
                "Dia chi: " + diaChi + "\n" +
                "Ngay Sinh: " + ngaySinh + "\n" +
                "DTB: " + tinhDiem();
    }
    
}
