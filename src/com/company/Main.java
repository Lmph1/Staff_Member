package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void menus() {
        System.out.print("\n================ Staff Member ====================\n");
        System.out.print("1) Insert Employee\n");
        System.out.print("2) Display Employee\n");
        System.out.print("3) Update Employee\n");
        System.out.print("4) Remove Employee\n");
        System.out.print("5) Exit\n");
        System.out.print("------------------------------------------------------\n");
    }
    public static void subMenus() {
        System.out.print("\n================ Insert Employee ====================\n");
        System.out.print("1) Volunteer\n");
        System.out.print("2) SalariedEmployee\n");
        System.out.print("3) HourlyEmployee\n");
        System.out.print("4) Back\n");
        System.out.print("------------------------------------------------------\n");
    }
    public static void DeleteEmployee(String ID){
        for(int i = 0 ; i < StaffData.size();i++){
            if(getIDFromList(StaffData.get(i)).equals(ID)){
                StaffData.remove(i);
                break;
            }
        }
    }
    public static void InsertEmployee(String ID) {
        int option;
        while (true) {
            subMenus();
            System.out.print("Please Input your option : ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:
                {
                    Volunteer volunteer = new Volunteer();
                    for (int i = 0; i < StaffData.size(); i++) {
                        if(i+1 == StaffData.size()) {
                            if(ID==null) {
                                volunteer.setId(i + 2);
                            }else{
                                volunteer.setId(Integer.parseInt(ID));
                            }
                            System.out.println("ID : " + volunteer.getId());
                            System.out.print("Name : ");
                            volunteer.setName(sc.next());
                            System.out.print("Address : ");
                            volunteer.setAddress(sc.next());
                            System.out.print("Salary : ");
                            volunteer.setSalary(sc.nextDouble());

                            StaffData.add(String.valueOf(new Volunteer(volunteer.getId(), volunteer.getName(), volunteer.getAddress(), volunteer.getSalary())));
                            break;
                        }
                    }
                }
                break;
                case 2:
                {
                    SalariedEmployee salariedEmployee = new SalariedEmployee();
                    for (int i = 0; i < StaffData.size(); i++) {
                        if(i+1 == StaffData.size()) {
                            if(ID==null) {
                                salariedEmployee.setId(i+2);
                            }else{
                                salariedEmployee.setId(Integer.parseInt(ID));
                            }

                            System.out.println("ID : " + salariedEmployee.getId());
                            System.out.print("Name : ");
                            salariedEmployee.setName(sc.next());
                            System.out.print("Address : ");
                            salariedEmployee.setAddress(sc.next());
                            System.out.print("Salary : ");
                            salariedEmployee.setSalary(sc.nextDouble());
                            System.out.print("Bunus : ");
                            salariedEmployee.setBunus(sc.nextDouble());

                            StaffData.add(String.valueOf(new SalariedEmployee(salariedEmployee.getId(), salariedEmployee.getName(), salariedEmployee.getAddress(), salariedEmployee.getSalary(), salariedEmployee.getBunus())));
                            break;
                        }
                    }
                }
                break;
                case 3:
                {
                    HourlySalaryEmployee hourlyEmployee = new HourlySalaryEmployee();

                    for (int i = 0; i < StaffData.size(); i++) {
                        if(i+1 == StaffData.size()) {
                            if(ID==null) {
                                hourlyEmployee.setId(i+2);
                            }else{
                                hourlyEmployee.setId(Integer.parseInt(ID));
                            }

                            System.out.println("ID : " + hourlyEmployee.getId());
                            System.out.print("Name : ");
                            hourlyEmployee.setName(sc.next());
                            System.out.print("Address : ");
                            hourlyEmployee.setAddress(sc.next());
                            System.out.print("Hour Worked : ");
                            hourlyEmployee.setHourWorked(sc.nextInt());
                            System.out.print("Rate : ");
                            hourlyEmployee.setRate(sc.nextDouble());

                            StaffData.add(String.valueOf(new HourlySalaryEmployee(hourlyEmployee.getId(), hourlyEmployee.getName(), hourlyEmployee.getAddress(),  hourlyEmployee.getRate(), hourlyEmployee.getHourWorked())));
                            break;
                        }
                    }
                }
                break;
                case 4:
                    return;
                default:
                    System.out.println("Your Option Out of Range!");
            }
        }
    }
    public static String getIDFromList(String data){
        return (data.substring(data.indexOf(":")+1,data.indexOf("N"))).trim();
    }
    static ArrayList<String> StaffData = new ArrayList<>();
    public static void main(String[] args) {
        int option;
        String Search_ID;

        StaffData.add(String.valueOf(new Volunteer(1,"SokDi","PP",54.6)));
        StaffData.add(String.valueOf(new HourlySalaryEmployee(2,"Sata","PV",55.3,4)));
        StaffData.add(String.valueOf(new SalariedEmployee(3,"Kayi","KPT",64.5,4.6)));
        StaffData.add(String.valueOf(new Volunteer(4,"Yuri","SR",57.2)));
        StaffData.add(String.valueOf(new SalariedEmployee(5,"Liya","MDK",94.44,5.3)));

        while (true) {
            menus();
            Scanner sc = new Scanner(System.in);
            System.out.print("Please choose your option : ");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    InsertEmployee(null);
                }
                break;
                case 2: {
                    for(int i = 0 ; i < StaffData.size();i++){
                        System.out.print(StaffData.get(i));
                        System.out.println("---------------------------------------");
                    }
                }
                break;
                case 3: {
                    boolean found = false;
                    System.out.print("Input Employee ID you want to update : ");
                    Search_ID = sc.next();

                    for(int i = 0 ; i < StaffData.size();i++){
                        if(getIDFromList(StaffData.get(i)).equals(Search_ID)){
                            DeleteEmployee(Search_ID);
                            InsertEmployee(Search_ID);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Can not find this Employee!");
                    }
                }
                break;
                case 4: {
                    boolean found = false;
                    System.out.print("Input Employee ID you want to remove : ");
                    Search_ID = sc.next();

                    for(int i = 0 ; i < StaffData.size();i++){
                        if(getIDFromList(StaffData.get(i)).equals(Search_ID)){
                            DeleteEmployee(Search_ID);
                            found=true;
                            System.out.println("This Employee has been remove!!!");
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Can not find this Employee!");
                    }
                }
                break;
                case 5:
                {
                    return;
                }
                default:
                    System.out.println("Your Option Out of Range!");
            }
        }
    }
}
