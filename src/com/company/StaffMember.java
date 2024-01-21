package com.company;

public class StaffMember {
    protected int id;
    protected String name,address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public StaffMember(int id, String name, String address){
//        this.id=id;
//        this.name=name;
//        this.address = address;
//    }
    public String toString(){//overriding the toString() method
        String Data;
        Data =  "ID : " + id + "\n";
        Data += "Name : " + name + "\n";
        Data += "Address : " + address + "\n";

        return Data;
    }
    public Double Pay(){
        return 0.0;
    }
}
