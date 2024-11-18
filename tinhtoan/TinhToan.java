
package oop.chuong2.tinhtoan;

import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        System.out.print("Nhap vao so nguyen a: ");
        a = sc.nextInt();
        
        System.out.print("Nhap vao so nguyen b: ");
        b = sc.nextInt();
        
        int tong = a + b;
        System.out.print("Tong hai so la: " + tong );
        System.out.println("");
        
        int hieu = a - b;
        System.out.print("hieu hai so la: " + hieu );
        System.out.println("");
        
        long tich = a * b;
        System.out.print("tich hai so la: " + tich );
        System.out.println("");
        
        double thuong = a / b;
        System.out.print("thuong hai so la: " + thuong );
    }   
}
