
package com.tienquan.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        int n = sc.nextInt();
        
        Interior[] iArray = new Interior[n];
               
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap san pham: " + (int)(i + 1));
            Interior x = new Interior();
            x.nhapThongTin();
            iArray[i] = x;
            
        }
        for(Interior x : iArray){
            System.out.println(x);
        }
        
        double maxPrice = 0;
        for(Interior x : iArray){
           maxPrice = Math.max(maxPrice, x.getPrice());
        }
        
        System.out.println(maxPrice);
        
        Arrays.sort(iArray, Comparator.comparingDouble(Interior::getPrice).reversed());
        System.out.println("Danh sach san pham sau khi sap xep theo gia:");
        for (Interior x : iArray) {
            System.out.println(x);
        }
        
        
    }
}
 