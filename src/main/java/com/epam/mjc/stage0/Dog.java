package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String animalColor, int pawNumbers, boolean hasfur) {
        super(animalColor, pawNumbers, hasfur);
        animalColor = "brown";
        pawNumbers = 4;
        hasfur = true;
    }

    @Override
    public String getDescription() {
        String myStr = "This animal is mostly brown. It has 4 paws and a fur.";
        return myStr;
    }
}
