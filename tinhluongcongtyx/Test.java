
package tinhluongcongtyx;

public class Test {
    public static void main(String[] args) {
        NguoiLaoDong pt = new LaoDongPhoThong();
        NguoiLaoDong ks = new KySu();
        
        //nhap thong tin
        pt.nhap();
        ks.nhap();
        
        // in thong tin
        System.out.println(pt);
        System.out.println(ks);      
    }
}
