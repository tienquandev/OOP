
package tinhluonggiangvien;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
    protected String maGV;
    protected double lCB, hSL;// thuoc tinh luong co ban va he so luong
    protected int thamNien;

    public GVCoHuu() {
        super();
    }
    public GVCoHuu(String maGV, double lCB, double hSL, int thamNien, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.maGV = maGV;
        this.lCB = lCB;
        this.hSL = hSL;
        this.thamNien = thamNien;
    }

    public String getMaGV() {
        return maGV;
    }
    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }
    public double getlCB() {
        return lCB;
    }
    public void setlCB(double lCB) {
        this.lCB = lCB;
    }
    public double gethSL() {
        return hSL;
    }
    public void sethSL(double hSL) {
        this.hSL = hSL;
    }
    public int getThamNien() {
        return thamNien;
    }
    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        super.nhap();
        
        System.out.print("Ma giang vien: ");
        this.maGV = sc.nextLine();
        System.out.println("");
        
        System.out.print("Luong co ban: ");
        this.lCB = sc.nextDouble();
        System.out.println("");
        
        System.out.print("He so luong: ");
        this.hSL = sc.nextDouble();
        System.out.println("");
        
        System.out.print("Tham nien cong tac: ");
        this.thamNien = sc.nextInt();
        System.out.println("");;
    }
    public double phuCap(){
        if(thamNien < 5) return 0;
        else if(thamNien == 5) return lCB * 0.05;
        else{
            double phanTram = lCB * 0.01;
            return lCB * phanTram;
        }             
    }
    
    @Override
    public double tinhLuong() {
        return lCB * hSL + phuCap();
    }
    
    @Override
    public String toString(){
        return super.toString() + 
               "Ma giang vien: " + maGV + "\n" +
               "Luong co ban: " + lCB + "\n" +
               "He so luong: " + hSL + "\n" +
               "Luong: " + tinhLuong();
    }
}
