
package com.tienquan.quanlymaytinh;


public class QuocGia {
    private String maQuocGia, tenQuocGia;

    public QuocGia() {
    }

    public QuocGia(String maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }
    

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return "QuocGia{" + "maQuocGia=" + maQuocGia + ", tenQuocGia=" + tenQuocGia + '}';
    }
    
    
}
