package com.codegym.declarationform.model;

public class ContactInfor {
    private String city;
    private String district;
    private String address;
    private String contactNumber;
    private String email;

    public ContactInfor() {
    }

    public ContactInfor(String city, String district, String address, String contactNumber) {
        this.city = city;
        this.district = district;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
