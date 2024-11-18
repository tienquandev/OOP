
package oop.chuong2.tinhtoandk;

import java.util.Scanner;

public class Tinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();
        
        System.out.print("Nhap ki tu: ");
        char x = sc.next().charAt(0);
        
        if( x == 'A'){
            int tong = a + b;
            System.out.print("Tong hai so la: " + tong);
        }
        else if(x == 'S'){
            int hieu = a - b;
            System.out.print("Hieu hai so la: " + hieu);
        }
        else if(x == 'M'){
            long tich = a * b;
            System.out.print("Tich hai so la: " + tich);
        }
        else if(x == 'D'){
            double thuong = a / b;
            System.out.print("Thuong hai so la: " + thuong);
        }
        else{
            System.out.println("Ky tu khong hop le.");
        }
        
    }
       
    

}
