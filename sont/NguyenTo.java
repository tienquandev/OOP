
package oop.chuong2.sont;

import java.util.Scanner;

public class NguyenTo {
    public static boolean nguyenTo(int n){
        if(n == 1) return true;
        
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
           if(n % i == 0) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        
        if(nguyenTo(n)){
            System.out.println("n la so nguyen to.");
        }
        else{
            System.out.println("n khong phai la so nguyen to.");
        }
        
    }
}
