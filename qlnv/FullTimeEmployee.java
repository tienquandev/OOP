
package com.tienquan.qlnv;

public class FullTimeEmployee extends Employee implements IEmployee{

    public FullTimeEmployee() {
        super();
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * paymentPerHour;
    }

    @Override
    public String toString() {
        return super.toString() + " " + calculateSalary();
    }
    
    
}
