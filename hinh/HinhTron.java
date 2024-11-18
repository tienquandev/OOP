
package com.tienquan.hinh;


public class HinhTron extends Hinh {
    
    private double r;

    public HinhTron() {
        super();
    }

    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * r * r;
    }
    
    
}
