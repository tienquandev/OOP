
import java.util.ArrayList;
import java.util.Scanner;

public class TestSV {
    
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            SinhVien s = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            s.chuanHoaTen();
            s.chuanHoaNgaySinh();
            arr.add(s);
        }
        
        double maxGpa = 0;
   
        for(SinhVien x : arr){
            maxGpa = Math.max(maxGpa, x.getGpa());
        }
        for(SinhVien x : arr){
            if(x.getGpa() == maxGpa){
                System.out.println(x);
            }
        }


    }
}

