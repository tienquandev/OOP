
package tienquan.test;

public class NhanVien {
    private String ma, hoTen;
    private int luongCoBan, ngayCong;
    private String chucVu;
    
    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, int luongCoBan, int ngayCong, String chucVu) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    
    public String getChucVu(){
        return this.chucVu;
    }
    
    public int getLuong(){
        return this.luongCoBan * this.ngayCong;
    }
    
    public int getThuong(){
        int luong = getLuong();
        
        if(this.ngayCong >= 25){
            return (int) (luong * 0.2);
        }
        else if(this.ngayCong >= 22){
            return (int) (luong * 0.1);
        }
        else{
            return 0; 
        }
        
    }
    public int getPhuCap(){
        if(this.chucVu.equals("GD")){
            return 250000;
        }
        else if(this.chucVu.equals("PGD")){
            return 20000;
        }
        else if(this.chucVu.equals("TP")){
            return 18000;
        }
        else if(this.chucVu.equals("NV")){
            return 15000;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.ma + " " + this.hoTen + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + (this.getLuong() + this.getThuong() + this.getPhuCap());
    }

    
}
