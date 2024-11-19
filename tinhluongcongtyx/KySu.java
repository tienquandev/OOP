
package tinhluongcongtyx;

import java.util.Scanner;


public class KySu extends NguoiLaoDong {
    private double luongCB, heSoLuong;

    public KySu() {
        super();
    }
    public KySu(double luongCB, double heSoLuong, String hoTen, String diaChi, String loaiLD, int soNgayCong) {
        super(hoTen, diaChi, loaiLD, soNgayCong);
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCB() {
        return luongCB;
    }
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
       
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        super.nhap();
        
        System.out.print("Luong co ban: ");
        this.luongCB = sc.nextDouble();
        System.out.println("");
        
        System.out.print("He so luong: ");
        this.heSoLuong = sc.nextDouble();
        System.out.println("");
    }
    
    public long thuong(){
        if(soNgayCong <= 15) return 500000;
        else if(soNgayCong < 25 && soNgayCong >15) return 1000000;
        else return 2000000;
    }
    @Override
    public double tinhLuong() {
        return luongCB * heSoLuong + thuong();
    }
    
    @Override
    public String toString(){
        return super.toString() + 
               "Luong co ban: " + luongCB + "\n" +
               "He so luong: " + heSoLuong + "\n" +
               "Luong: " + tinhLuong();
    }
}
