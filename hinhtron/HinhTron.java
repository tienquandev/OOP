
package oop.chuong2.hinhtron;

import java.util.Scanner;


public class HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh: ");
        double r = sc.nextDouble();
        
        double dt =r * r * Math.PI;
        System.out.print("dien tich la: " + dt);
        System.out.println("");
        
        double cv = r * 2 * Math.PI;
        System.out.print("chu vi la: " + cv);
        
    }
}
