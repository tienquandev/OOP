
package com.tienquan.quanlymaytinh;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Ngay ngaySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;
    private String tenQuocGia;

    public MayTinh() {
    }

    public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, double thoiGianBaoHanh) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    
    @Override
    public String toString() {
        return "MayTinh{" + "hangSanXuat=" + hangSanXuat + ", ngaySanXuat=" + ngaySanXuat + ", giaBan=" + giaBan + ", thoiGianBaoHanh=" + thoiGianBaoHanh + '}';
    }
    
}
