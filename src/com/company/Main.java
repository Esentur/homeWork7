package com.company;

public class Main {

    public static void main(String[] args) {
    Player [] players = {new Boss(), new Warrior(), new Magical(), new Mental()};

    for (int i=0; i<players.length;i++){
        players[i].makeSpeech();
    }
    SuperAbilityApplicable[] superAbilityApplicableHeroes = {new Boss(),new Warrior(),new Magical(),new Mental()};
        for (int i=0; i<superAbilityApplicableHeroes.length;i++){
            superAbilityApplicableHeroes[i].superAbilityapply();
        }
    }
}
