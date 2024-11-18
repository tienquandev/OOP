
package com.tienquan.quanlymaytinh;


public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(12, 5, 2003);
        Ngay ngay2 = new Ngay(1, 5, 2004);
        Ngay ngay3 = new Ngay(2, 6, 2000);
        
        QuocGia quocGia1 = new QuocGia("VN", "Viet Nam");
        QuocGia quocGia2 = new QuocGia("USA", "Hoa Ky");
        QuocGia quocGia3 = new QuocGia("bL", "Ba Lan");
        
        HangSanXuat hangSanXuat1 = new HangSanXuat("Macbook", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("VNbook", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Asus", quocGia3);
        
        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 23, 10);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 99, 20);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 30, 5);
        
        System.out.println(mayTinh2);
    }
}
