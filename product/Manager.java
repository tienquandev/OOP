
package com.tienquan.product;


public class Manager implements InteriorManager{
    
    Interior interior = new Interior();

    @Override
    public void addInterior(Interior x) {
        interior.nhapThongTin();
    }

    @Override
    public void editInterior(Interior x) {
    }

    @Override
    public void delInterior(Interior x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void searchInterior(Interior x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
