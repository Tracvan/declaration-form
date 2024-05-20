package com.codegym.declarationform.model;

public class MovementTime {
    private String moveDate;
    private String moveMonth;
    private String moveYear;
    private String backDate;
    private String backMonth;
    private String backYear;

    public MovementTime() {
    }

    public MovementTime(String moveDate, String moveMonth, String moveYear, String backDate, String backMonth, String backYear) {
        this.moveDate = moveDate;
        this.moveMonth = moveMonth;
        this.moveYear = moveYear;
        this.backDate = backDate;
        this.backMonth = backMonth;
        this.backYear = backYear;
    }

    public String getMoveDate() {
        return moveDate;
    }

    public void setMoveDate(String moveDate) {
        this.moveDate = moveDate;
    }

    public String getMoveMonth() {
        return moveMonth;
    }

    public void setMoveMonth(String moveMonth) {
        this.moveMonth = moveMonth;
    }

    public String getMoveYear() {
        return moveYear;
    }

    public void setMoveYear(String moveYear) {
        this.moveYear = moveYear;
    }

    public String getBackDate() {
        return backDate;
    }

    public void setBackDate(String backDate) {
        this.backDate = backDate;
    }

    public String getBackMonth() {
        return backMonth;
    }

    public void setBackMonth(String backMonth) {
        this.backMonth = backMonth;
    }

    public String getBackYear() {
        return backYear;
    }

    public void setBackYear(String backYear) {
        this.backYear = backYear;
    }

}
