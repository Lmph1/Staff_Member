package com.company;

public class SalariedEmployee extends StaffMember{
    private Double salary;
    private Double bunus;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBunus() {
        return bunus;
    }

    public void setBunus(Double bunus) {
        this.bunus = bunus;
    }
    public SalariedEmployee(){}
    public SalariedEmployee (int id, String name, String address, Double salary, Double bunus){
        super.id = id;
        super.name = name;
        super.address = address;
        this.salary = salary;
        this.bunus = bunus;
    }
    public String toString(){//overriding the toString() method
        String Data;
        Data = "SalariedEmployee\n";
        Data += "ID : " + id + "\n";
        Data += "Name : " + name + "\n";
        Data += "Address : " + address + "\n";
        Data += "Salary : " + salary + "\n";
        Data += "Bunus : " + bunus + "\n";
        Data += "Payment : " + Pay(salary,bunus) + "\n";

        return Data;
    }
    public Double Pay(Double salary, Double bunus){
        return salary+bunus;
    }
}
