
package tinhluongcongtyx;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    protected String hoTen, diaChi, loaiLD;
    protected int soNgayCong;

    public NguoiLaoDong() {
    }
    public NguoiLaoDong(String hoTen, String diaChi, String loaiLD, int soNgayCong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLD = loaiLD;
        this.soNgayCong = soNgayCong;
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
    public String getLoaiLD() {
        return loaiLD;
    }
    public void setLoaiLD(String loaiLD) {
        this.loaiLD = loaiLD;
    }
    public int getSoNgayCong() {
        return soNgayCong;
    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
   
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ho Ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("");
        
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println("");;
        
        System.out.print("Loai lao dong: ");
        this.loaiLD = sc.nextLine();
        System.out.println("");
        
        System.out.print("So ngay cong: ");
        this.soNgayCong = sc.nextInt();
        System.out.println("");
    }
    
    public abstract double tinhLuong();
    
    @Override
    public String toString(){
        return "Ho ten: " + hoTen + "\n" +
               "Dia chi: " + diaChi + "\n" +
               "Loai chuong trinh: " + loaiLD + "\n" +
               "So ngay cong: " + soNgayCong;
    }
    
}
