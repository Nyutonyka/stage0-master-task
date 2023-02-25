package com.epam.OOP;

public class Bird extends Animal{

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription(){
        String color = getColor();
        String s = isHasFur(isHasFur());
        int numberOfPaws = getNumberOfPaws();
        String r = getNumberOfPaws(numberOfPaws);
        return "This animal is mostly " + color +
                ". It has "+ numberOfPaws +
                " " + r +" and " + s + " fur. Moreover, it has 2 wings and can fly.";
    }
}
