package com.codegym.declarationform.model;

public class HealthHistory {
    private boolean animalTouch;
    private boolean infection;

    public HealthHistory() {
    }

    public HealthHistory(boolean animalTouch, boolean infection) {
        this.animalTouch = animalTouch;
        this.infection = infection;
    }

    public boolean isAnimalTouch() {
        return animalTouch;
    }

    public void setAnimalTouch(boolean animalTouch) {
        this.animalTouch = animalTouch;
    }

    public boolean isInfection() {
        return infection;
    }

    public void setInfection(boolean infection) {
        this.infection = infection;
    }
}
