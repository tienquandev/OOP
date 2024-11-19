
package tinhluonggiangvien;

import java.util.Scanner;

public abstract class GiangVien {
    // thuoc tinh
    protected String hoTen, ngaySinh, diaChi;
    
    //contructor
    public GiangVien() {
    }
    public GiangVien(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    // phuong thuc setter, getter
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ho Ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("");
        
        System.out.print("Ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("");
        
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("");;
    }
    public abstract double tinhLuong();
    
    // Phuong thuc toString
    @Override
    public String toString(){
        return "Ho ten: " + hoTen + "\n" +
               "Ngay sinh: " + ngaySinh + "\n" +
               "Dia chi: " + diaChi;
    }
}
