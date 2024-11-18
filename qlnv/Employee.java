
package com.tienquan.qlnv;


public class Employee {
    protected String name;
    protected int paymentPerHour;

    public Employee() {
    }
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return name + " " + paymentPerHour + " ";
    }

    int calculateSalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
