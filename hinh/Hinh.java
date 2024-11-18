
package com.tienquan.hinh;

public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh() {
    }
    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }
    
    public abstract double tinhDienTich();   
}
