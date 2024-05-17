package com.codegym.declarationform.model;

import java.util.Date;

public class Declaration {
    private CustomerInfor customerInfor;
    private MovementInfor movementInfor;
    private MovementTime movementTime;
    private String ArrivedLocation;
    private ContactInfor contactInfor;
    private Symptom symptom;
    private boolean healthHistory;

    private Date test;

    public Date getTest() {
        return test;
    }

    public void setTest(Date test) {
        this.test = test;
    }

    public Declaration(CustomerInfor customerInfor, MovementInfor movementInfor, MovementTime movementTime, String arrivedLocation, ContactInfor contactInfor, Symptom symptom, boolean healthHistory, Date test) {
        this.customerInfor = customerInfor;
        this.movementInfor = movementInfor;
        this.movementTime = movementTime;
        ArrivedLocation = arrivedLocation;
        this.contactInfor = contactInfor;
        this.symptom = symptom;
        this.healthHistory = healthHistory;
        this.test = test;
    }

    public Declaration(CustomerInfor customerInfor, MovementInfor movementInfor, MovementTime movementTime, String arrivedLocation, ContactInfor contactInfor, Symptom symptom, boolean healthHistory) {
        this.customerInfor = customerInfor;
        this.movementInfor = movementInfor;
        this.movementTime = movementTime;
        ArrivedLocation = arrivedLocation;
        this.contactInfor = contactInfor;
        this.symptom = symptom;
        this.healthHistory = healthHistory;
    }

    public Declaration() {
    }

    public CustomerInfor getCustomerInfor() {
        return customerInfor;
    }

    public void setCustomerInfor(CustomerInfor customerInfor) {
        this.customerInfor = customerInfor;
    }

    public MovementInfor getMovementInfor() {
        return movementInfor;
    }

    public void setMovementInfor(MovementInfor movementInfor) {
        this.movementInfor = movementInfor;
    }

    public MovementTime getMovementTime() {
        return movementTime;
    }

    public void setMoveTime(MovementTime movementTime) {
        this.movementTime = movementTime;
    }

    public String getArrivedLocation() {
        return ArrivedLocation;
    }

    public void setArrivedLocation(String arrivedLocation) {
        ArrivedLocation = arrivedLocation;
    }

    public ContactInfor getContactInfor() {
        return contactInfor;
    }

    public void setContactInfor(ContactInfor contactInfor) {
        this.contactInfor = contactInfor;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    public boolean isHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(boolean healthHistory) {
        this.healthHistory = healthHistory;
    }
}
