package com.company;

public class Mental extends Player implements SuperAbilityApplicable {
    @Override
    public void superAbilityapply() {
        System.out.println("Ментал наносит критический телекинетический урон.");
    }
    public  void makeSpeech(){
        System.out.println("Zmmmmmmm");
    }
}
