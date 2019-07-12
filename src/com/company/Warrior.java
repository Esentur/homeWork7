package com.company;

public class Warrior extends Player implements SuperAbilityApplicable {
    @Override
    public void superAbilityapply() {
        System.out.println("Воин наносит критический физический урон.");
    }
    public  void makeSpeech(){
        System.out.println("Kiya uhh");
    }
}
