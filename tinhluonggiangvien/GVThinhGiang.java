
package tinhluonggiangvien;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien implements IGVThinhGiang {
    protected int soTiet;
    protected double donGia;

    public GVThinhGiang() {
        super();
    }
    public GVThinhGiang(int soTiet, double donGia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.soTiet = soTiet;
        this.donGia = donGia;
    }
    
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        super.nhap();
        
        System.out.print("So tiet: ");
        this.soTiet = sc.nextInt();
        System.out.println("");
        
        System.out.print("Don gia: ");
        this.donGia = sc.nextDouble();
        System.out.println("");
    }

    @Override
    public double thuNhap() {
        return 0.15 * (soTiet * donGia);
    }
    
    @Override
    public double tinhLuong() {
        return soTiet * donGia - thuNhap();
    }
    
    @Override
    public String toString(){
        return super.toString() + 
               "So tiet day: " + soTiet + "\n" +
               "Don gia: " + donGia + "\n" +
               "Luong: " + tinhLuong();
    }   
}
