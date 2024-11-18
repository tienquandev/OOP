
package oop.chuong3.benhnhan;

import java.util.Scanner;


public class BenhNhan extends Nguoi {
    protected String tienSu;
    protected String chuanDoan;
    protected BenhVien benhVien;

    public BenhNhan() {
        super();
        this.benhVien = new BenhVien();
        
    }

    public BenhNhan(String tienSu, String chuanDoan, BenhVien benhVien, String ten, int tuoi, String gioiTinh) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChuanDoan() {
        return chuanDoan;
    }

    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    public String layTenBenhVien(){
        return benhVien.getTen();
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
//        BenhVien x = new BenhVien();
        
        super.nhap();
        
        System.out.print("Tien su: ");
        this.tienSu = sc.nextLine();
        System.out.println("");
        
        System.out.print("Chuan doan: ");
        this.chuanDoan = sc.nextLine();
        System.out.println("");
        
        this.benhVien.nhap();
//        x.nhap();
//        this.benhVien = x;
   
    }
   

    @Override
    public String toString() {
        
        return super.toString() + "\n" + "Benh an {" + " tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + "}" + "\n" + benhVien ;
    }
    
    
    
}
