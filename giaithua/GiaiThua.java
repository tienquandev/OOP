
package oop.chuong2.giaithua;

import java.util.Scanner;

public class GiaiThua {
    public static long giaiThua(int n){
        if(n == 0) return 1;
        return n * giaiThua(n - 1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        
        System.out.println(giaiThua(n));
    }
 
}
