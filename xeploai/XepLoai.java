
package oop.chuong2.xeploai;

import java.util.Scanner;


public class XepLoai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double diem;
        do{
            System.out.print("Nhap diem: ");
            diem = sc.nextDouble();
        }while(diem < 1 || diem > 100);
        
        if(diem >= 90 && diem <= 100) System.out.println("Loai: A");
        else if(diem < 90 && diem >= 80) System.out.println("loai: B");
        else if(diem < 80 && diem >= 70) System.out.println("Loai: C");
        else if(diem < 70 && diem >= 50) System.out.println("Loai: D");
        else System.out.println("Loai: F");
    }
    
}
