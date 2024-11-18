
package oop.chuong3.benhnhan;

import java.util.Scanner;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;

    public BenhVien() {
    }

    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten benh vien: ");
        this.ten = sc.nextLine();
        System.out.println("");
        
        System.out.print("Dia chi benh vien: ");
        this.diaChi = sc.nextLine();
        System.out.println("");
        
        System.out.print("Ten giam doc benh vien: ");
        this.giamDoc = sc.nextLine();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Benh vien{" + "ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + '}';
    }
    
    
}

