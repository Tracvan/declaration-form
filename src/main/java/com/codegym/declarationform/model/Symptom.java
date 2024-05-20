package com.codegym.declarationform.model;

public class Symptom {
    boolean fever;
    boolean cough;
    boolean dyspnea;
    boolean soreThroat;
    boolean nausea;
    boolean diarrhea;
    boolean skinBleeding;
    boolean skinRash;

    public Symptom() {
    }

    public Symptom(boolean fever, boolean cough, boolean dyspnea, boolean soreThroat, boolean nausea, boolean diarrhea, boolean skinBleeding, boolean skinRash) {
        this.fever = fever;
        this.cough = cough;
        this.dyspnea = dyspnea;
        this.soreThroat = soreThroat;
        this.nausea = nausea;
        this.diarrhea = diarrhea;
        this.skinBleeding = skinBleeding;
        this.skinRash = skinRash;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public void setDyspnea(boolean dyspnea) {
        this.dyspnea = dyspnea;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public void setNausea(boolean nausea) {
        this.nausea = nausea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public void setSkinBleeding(boolean skinBleeding) {
        this.skinBleeding = skinBleeding;
    }

    public void setSkinRash(boolean skinRash) {
        this.skinRash = skinRash;
    }

    public boolean isFever() {
        return fever;
    }

    public boolean isCough() {
        return cough;
    }

    public boolean isDyspnea() {
        return dyspnea;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public boolean isNausea() {
        return nausea;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public boolean isSkinBleeding() {
        return skinBleeding;
    }

    public boolean isSkinRash() {
        return skinRash;
    }
}
