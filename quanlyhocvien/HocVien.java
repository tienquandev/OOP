
package oop.chuong3.quanlyhocvien;

import java.util.Scanner;


public abstract class HocVien {
    protected String hoTen, diaChi, loaiChuongTrinh;

    public HocVien() {
    }   
    public HocVien(String hoTen, String diaChi, String loaiChuongTrinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getLoaiChuongTrinh() {
        return loaiChuongTrinh;
    }
    public void setLoaiChuongTrinh(String loaiChuongTrinh) {
        this.loaiChuongTrinh = loaiChuongTrinh;
    }
    
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("");
        
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("");
        
        System.out.print("Loai chuong trinh hoc: ");
        this.diaChi = sc.nextLine();
        System.out.println("");

    }
    public abstract double HocPhi();

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + "\n" + 
               "Dia chi: " + diaChi + "\n" +
               "Loai chuong trinh dang ky hoc: " + loaiChuongTrinh + "\n";
    }
    
    
    
}
