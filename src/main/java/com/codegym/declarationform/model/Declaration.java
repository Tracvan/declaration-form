package com.codegym.declarationform.model;

import java.util.Date;

public class Declaration {
    private CustomerInfor customerInfor;
    private MovementInfor movementInfor;
    private MovementTime movementTime;

    private String ArrivedLocation;
    private ContactInfor contactInfor;
    private Symptom symptom;
    private HealthHistory healthHistory;


    public Declaration(CustomerInfor customerInfor, MovementInfor movementInfor, MovementTime movementTime,
                       String arrivedLocation, ContactInfor contactInfor, Symptom symptom, HealthHistory healthHistory ) {
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


    public HealthHistory getHealthHistory() {
        return healthHistory;
    }

    public void setHealthHistory(HealthHistory healthHistory) {
        this.healthHistory = healthHistory;
    }

    public void setMovementTime(MovementTime movementTime) {
        this.movementTime = movementTime;
    }

}
