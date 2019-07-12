package com.company;

public class Boss extends Player implements SuperAbilityApplicable {
    @Override
    public void superAbilityapply() {
        System.out.println("У босса есть защита, нет супер способности.");
    }
    public  void makeSpeech(){
        System.out.println("Vuha ha ha");
    }
}
