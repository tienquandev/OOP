
package oop.chuong2.tiendien;

import java.util.Scanner;


public class TienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so dien: ");
        double  so = sc.nextDouble();
        
        double tienDien = 0;
        if(so > 0 && so <= 50){
            tienDien = so * 1484;
            System.out.println("Tien dien: " + tienDien);
        }
        else if(so > 50 && so <= 100){
            tienDien = so * 1533;
            System.out.println("Tien dien: " + tienDien);
        }
        else if(so > 100 && so <= 200){
            tienDien = so * 1786;
            System.out.println("Tien dien: " + tienDien);
        }
        else {
            tienDien = so * 1533;
            System.out.println("Tien dien: " + tienDien);
        }
    }
}
