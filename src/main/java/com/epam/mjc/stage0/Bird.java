package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird(){
        super();
    }

    public Bird(String animalColor, int pawNumbers, boolean hasfur) {
        super(animalColor, pawNumbers, hasfur);
        animalColor = "blue";
        pawNumbers = 2;
        hasfur = false;
    }

    @Override
    public String getDescription() {
        String myStr = "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
        return myStr;
    }
}
