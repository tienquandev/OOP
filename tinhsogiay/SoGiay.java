
package oop.chuong2.tinhsogiay;

import java.util.Scanner;


public class SoGiay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so gio: ");
        int gio = sc.nextInt();
        System.out.println("");
        
        System.out.print("Nhap so phut: ");
        int phut = sc.nextInt();
        System.out.println("");
        
        System.out.print("Nhap so giay: ");
        int giay = sc.nextInt();
        
        long soGiay = giay + (phut * 60) + (gio * 60 * 60);
        System.out.print("Tong so giay la: " + soGiay);
    }
}
