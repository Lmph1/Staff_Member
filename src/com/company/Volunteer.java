package com.company;
import java.util.Scanner;

public class Volunteer extends StaffMember{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Volunteer (){}

    public Volunteer (int id, String name, String address, double salary){
        super.id = id;
        super.name = name;
        super.address = address;
        this.salary = salary;
    }
    public String toString(){//overriding the toString() method
        String Data;
        Data = "Volunteer\n";
        Data += "ID : " + super.id + "\n";
        Data += "Name : " + super.name + "\n";
        Data += "Address : " + super.address + "\n";
        Data += "Salary : " + salary + "\n";

        return Data;
    }
    public Double Pay(Double salary){
        return salary;
    }
}
