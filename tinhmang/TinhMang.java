
package oop.chuong2.tinhmang;

import java.util.Scanner;


public class TinhMang {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n;
        do{
            n= sc.nextInt();
        }while(n < 0);
        
        int[] a = new int[n];
        
        System.out.println("Nhap mang: ");
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        
        long sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += a[i];
        }
         System.out.print("Tong pt mang: " + sum);
    }
}
