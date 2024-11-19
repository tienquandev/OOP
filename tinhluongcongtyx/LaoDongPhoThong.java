
package tinhluongcongtyx;

import java.util.Scanner;


public class LaoDongPhoThong extends NguoiLaoDong {
    private double donGia;

    public LaoDongPhoThong() {
        super();
    }
    public LaoDongPhoThong(double donGia, String hoTen, String diaChi, String loaiLD, int soNgayCong) {
        super(hoTen, diaChi, loaiLD, soNgayCong);
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        super.nhap();
        
        System.out.print("Don gia ngay cong: ");
        this.donGia = sc.nextDouble();
        System.out.println("");
    }
    public long thuong(){
        if(soNgayCong <= 15) return 0;
        else if(soNgayCong < 25 && soNgayCong >15) return 700000;
        else return 1000000;
    }
    @Override
    public double tinhLuong() {
        return soNgayCong * donGia + thuong();
    }
    
    @Override
    public String toString(){
        return super.toString() + 
               "Don gia: " + donGia + "\n" +
               "Luong: " + tinhLuong();
    }
}
