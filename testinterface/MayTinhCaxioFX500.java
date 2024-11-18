
package com.tienquan.testinterface;


public class MayTinhCaxioFX500 implements MayTinhBoTuiInterface{

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;// can su dung try catch
    }
    
}
