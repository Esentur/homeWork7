package com.company;

public class Magical extends Player implements SuperAbilityApplicable {
    @Override
    public void superAbilityapply() {
        System.out.println("Маг наносит критический магический урон.");
    }
    public  void makeSpeech(){
        System.out.println("Abra kadabra");
    }
}
