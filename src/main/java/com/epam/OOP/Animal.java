package com.epam.OOP;

public class Animal {


    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal() {
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getNumberOfPaws(int numberOfPaws) {
        if (numberOfPaws == 1) {
            return "paw";
        } else {
            return "paws";
        }
    }

    public String isHasFur(boolean hasFur) {
        if (hasFur) {
            return "a";
        } else {
            return "no";
        }
    }

    public String getDescription(){
        String color = getColor();
        String s = isHasFur(isHasFur());
        int numberOfPaws = getNumberOfPaws();
        String r = getNumberOfPaws(numberOfPaws);
        return "This animal is mostly " + color +
                ". It has "+ numberOfPaws +
                " " + r +" and " + s + " fur.";
    }
}
