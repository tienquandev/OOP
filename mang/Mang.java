
package oop.chuong2.mang;

import java.util.Scanner;


public class Mang {
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
        
        System.out.println("Mang vua nhap la: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }
        
    }
}
