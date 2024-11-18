
package oop.chuong2.hcn;

import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap canh a: ");
        int a = sc.nextInt();
        System.out.print("Nhap canh b: ");
        int b = sc.nextInt();
        
        long dt = a * b;
        System.out.print("dien tich la: " + dt);
        System.out.println("");
        
        long cv = (a + b) * 2;
        System.out.print("chu vi la: " + cv);
        
    }
    
}
