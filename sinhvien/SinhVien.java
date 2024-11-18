
public class SinhVien {
    private String msv;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(int msv, String hoTen, String ngaySinh, String lop, double gpa) {
        this.msv = "SV" + String.format("%03d", msv);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void chuanHoaTen(){
        String[] arr = this.hoTen.split("\\s+"); //split("\\s+") cắt chuỗi ở các vị trí cách và lưu và mảng arr
        String newName = "";
        for(String x : arr){
            newName += Character.toUpperCase(x.charAt(0)); // chuyển kí tự đầu thành hoa
            for(int i = 1 ; i < x.length() ; i++){
                newName += Character.toLowerCase(x.charAt(i));// các kí tự sau chuyển thành thường
            }
            newName += " ";
        }
        this.hoTen = newName.trim();// trim() xóa cách ở đầu, cuối
    }
    public void chuanHoaNgaySinh(){
        StringBuilder sb = new StringBuilder(this.ngaySinh);// StringBuilder chỉnh sửa ngay trên chuỗi mà k cần tạo chuỗi mới
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString(); //toString chuyển nội dung của sb thành một chuỗi
    }

    @Override
    public String toString() {
        return "msv=" + msv + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", lop=" + lop + ", gpa=" + String.format("%.2f", gpa);
    }
    
}
