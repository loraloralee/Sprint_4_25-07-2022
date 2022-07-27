package home.data;

import org.openqa.selenium.WebDriver;

public class Order {
    private String name;
    private String surname;
    private String address;
    private String station;
    private String phone;


    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAddress(){
        return address;
    }
    public String getStation(){
        return station;
    }
    public String getPhone(){
        return phone;
    }

    public Order(String name, String surname, String address, String station, String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.station = station;
        this.phone = phone;
    }

}
