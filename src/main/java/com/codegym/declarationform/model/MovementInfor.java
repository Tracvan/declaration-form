package com.codegym.declarationform.model;

public class MovementInfor {
    private String vehicle;
    private String vehicleId;
    private String seatNum;

    public MovementInfor(String vehicle) {
        this.vehicle = vehicle;
    }

    public MovementInfor() {
    }

    public MovementInfor(String vehicle, String vehicleId, String seatNum) {
        this.vehicle = vehicle;
        this.vehicleId = vehicleId;
        this.seatNum = seatNum;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
}
