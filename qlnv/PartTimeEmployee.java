
package com.tienquan.qlnv;


public class PartTimeEmployee extends Employee implements IEmployee{
    private int workingHours;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * paymentPerHour;
    }

    @Override
    public String toString() {
        return super.toString() + workingHours + " " + calculateSalary();
    }
    

}
