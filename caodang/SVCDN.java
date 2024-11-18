
package com.tienquan.caodang;

import java.util.Scanner;


public class SVCDN extends Nguoi{
    private String maSV;
    private double tDKT, dTKTHP;
    private int sMKT;

    public SVCDN() {
        super();
    }

    public SVCDN(String maSV, double tDKT, double dTKTHP, int sMKT, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.maSV = maSV;
        this.tDKT = tDKT;
        this.dTKTHP = dTKTHP;
        this.sMKT = sMKT;
    }
    
    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap tong diem diem tra: ");
        this.tDKT = sc.nextDouble();
        System.out.println("");
        
        System.out.print("Nhap diem thi ket thuc hoc phan: ");
        this.dTKTHP = sc.nextDouble();
        System.out.println("");
        
        System.out.print("Nhap so mon kiem tra: ");
        this.sMKT = sc.nextInt();

    }

    @Override
    public double tinhDiem() {
        return this.tDKT / this.sMKT;
    }

    @Override
    public String toString() {
        return "SVCDN{" + "maSV=" + maSV + ", tDKT=" + tDKT + ", dTKTHP=" + dTKTHP + ", sMKT=" + sMKT + '}' + "\n" +
                super.toString();
    }
    
    
}
