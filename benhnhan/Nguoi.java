
package oop.chuong3.benhnhan;

import java.util.Scanner;

public class Nguoi {
    protected String ten;
    protected int tuoi;
    protected String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten benh nhan: ");
        this.ten = sc.nextLine();
        System.out.println("");
        
        System.out.print("Tuoi benh nhan: ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Benh Nhan {" + "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }
    
    
}
