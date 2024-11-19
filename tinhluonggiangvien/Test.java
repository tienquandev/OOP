
package tinhluonggiangvien;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        do{
            System.out.print("Nhap so luong giang vien: ");
            n = sc.nextInt();
        }while(n < 2 || n > 4);
        
        GVCoHuu[] gvArr = new GVCoHuu[n];
        
        for(int i = 0 ; i < n ; i++){
            GVCoHuu gv = new GVCoHuu();
            
            gv.nhap();
            gvArr[i] = gv;
        }
        
        for(GiangVien x : gvArr){
            System.out.println(x);
        }
        
        System.out.print("Nhap ma giang vien can tim: ");
        String ma = sc.nextLine();       
        for(int i = 0 ; i < n ; i++){
            if(gvArr[i].getMaGV().equals(ma)){
                System.out.println(gvArr[i]);
            }
            else{
                System.out.println("Khong ton tai!");
            }
        }
        
        
    }
}
