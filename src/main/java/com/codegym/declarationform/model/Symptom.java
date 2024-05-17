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
