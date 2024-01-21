public class HourlySalaryEmployee extends StaffMember{
    private Double rate;
    private int hourWorked;

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }
    public HourlySalaryEmployee (){}
    public HourlySalaryEmployee (int id, String name, String address, Double rate, int hourWorked){
        super.id = id;
        super.name = name;
        super.address = address;
        this.hourWorked = hourWorked;
        this.rate = rate;
    }
    public String toString(){//overriding the toString() method
        String Data;
        Data = "HourlySalaryEmployee\n";
        Data += "ID : " + id + "\n";
        Data += "Name : " + name + "\n";
        Data += "Address : " + address + "\n";
        Data += "Hour Worked : " + hourWorked + "\n";
        Data += "Rate : " + rate + "\n";
        Data += "Payment : " + Pay(rate,hourWorked) + "\n";

        return Data;
    }
    public Double Pay(Double rate, int hourWorked){
        return hourWorked*rate;
    }
}
