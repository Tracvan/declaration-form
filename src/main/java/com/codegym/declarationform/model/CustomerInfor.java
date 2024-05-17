package com.codegym.declarationform.model;

public class CustomerInfor {
    private String name;
    private int yearOfBirth;
    private String gender;
    private String national;
    private int id;

    public CustomerInfor(String name, int yearOfBirth, String gender, String national, int id) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.national = national;
        this.id = id;
    }

    public CustomerInfor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
