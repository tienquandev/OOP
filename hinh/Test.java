
package com.tienquan.hinh;


public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(4, 6);
        ToaDo td2 = new ToaDo(7, 3);
        ToaDo td3 = new ToaDo(6, 6);
        
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2, 10);
        Hinh h3 = new HinhChuNhat(td3, 3, 4);
        
        System.out.println("Diem: " + h1.tinhDienTich());
        System.out.println("Hinh Tron: " + h2.tinhDienTich());
        System.out.println("HCN: " + h3.tinhDienTich());
    }
}
