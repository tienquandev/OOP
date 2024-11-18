
package com.tienquan.qlnv;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] nv = {
                new PartTimeEmployee("tien quan", 20, 8),
                new PartTimeEmployee("hai nguyen", 20, 6),
                new PartTimeEmployee("van nam", 18, 4),

                new FullTimeEmployee("Tien nam", 50),
                new FullTimeEmployee("Khanh Linh", 100),
                new FullTimeEmployee("Tien Chien", 70)
        };
       
        for(int i = 0 ; i < nv.length ; i++){
            System.out.println(nv[i]);
        }
//        
//        System.out.print("Nhap ten nhan vien: ");
//        String ten = sc.nextLine();
//        for(int i = 0 ; i < nv.length ; i++){           
//            if(nv[i].getName().equals(ten)){
//                System.out.println("Cap nhap: ");
//                
//                System.out.print("Ten: ");
//                String x = sc.nextLine();
//                nv[i].setName(x);
//                
//                System.out.println("Payment Per Hour: ");
//                int y = sc.nextInt();
//                nv[i].setPaymentPerHour(y);
//            }
//        }
        
        int maxCalculateSalary = 0;       
        for(int i = 0 ; i < nv.length ; i++){
            maxCalculateSalary = Math.max(maxCalculateSalary, nv[i].calculateSalary());
        }
        System.out.println(maxCalculateSalary);
    }   

        
}
