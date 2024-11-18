
package oop.chuong2.nhapxuat;

import java.util.Scanner;

public class NhapXuat {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen: ");
        int x = sc.nextInt();
        
        System.out.print("Nhap so thuc: ");
        double y = sc.nextDouble();
                
        System.out.print("Nhap ky tu: ");
        char z = sc.next().charAt(0);
        
        sc.nextLine();
        System.out.print("Nhap so chuoi ky tu: ");
        String s = sc.nextLine();
        
        sc.close();
        
        System.out.printf("So nguyen: %d | So thuc: %.2f | Chuoi: %s | Ky tu: %c\n", x, y, s, z);
    }
}
