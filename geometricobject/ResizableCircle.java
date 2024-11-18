
package com.tienquan.geometricobject;


public class ResizableCircle extends Circle implements Resizable{
    private int percent;
    
    public ResizableCircle() {
        super();
    }
    public ResizableCircle(double radius, int percent) {
        super(radius);
        this.percent = percent;
    }

    @Override
    public void resize() {
        radius *= percent / 100.0 ;
    }

    @Override
    public String toString() {
        return super.toString() + percent ;
    }


    
    
    
}
