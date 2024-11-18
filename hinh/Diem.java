
package com.tienquan.hinh;


public class Diem extends Hinh {

    public Diem() {
        super();
    }

    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }
    
    


}
