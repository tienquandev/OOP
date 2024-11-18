
package com.tienquan.hinh;


public class HinhChuNhat extends Hinh {
    private double chieuRong, chieuDai;

    public HinhChuNhat() {
       super();
    }

    public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuDai) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    
    
}
