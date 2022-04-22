package com.example.employeemanagement;

public class Address {
    private int streetNumber;
    private String streetName;
    private String city;
    private String province;

    public Address(int streetNumber, String streetName, String city, String province) {
        setStreetNumber(streetNumber);
        this.streetName = streetName;
        this.city = city;
        this.province = province;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        if (streetNumber < 1000000 && streetNumber >= 0){    //because 986039 Oxford-Perth Road is the largest street number.
            this.streetNumber = streetNumber;
        }
        else {
            throw new IllegalArgumentException("Please enter a valid street number!");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
