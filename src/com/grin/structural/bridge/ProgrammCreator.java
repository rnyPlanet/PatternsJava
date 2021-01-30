package com.grin.structural.bridge;

public class ProgrammCreator {

    public static void main(String[] args) {
        Program[] programms = {
                new BankSystem(new JavaDeveloper())
        };

        for(Program programm : programms) {
            programm.develop();
        }
    }

}
