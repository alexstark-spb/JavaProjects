package com.alexstark;

public class Actor extends Brief {

    boolean isFamous;

    public Actor(String gender, String name, int age, String character, String genre) {
        super(gender, name, age, character, genre);
    }


    void playRole() {
        System.out.println(name + " начал монолог: " + "Быть или не быть, вот в чем вопрос. " +
                "Достойно ль смиряться под ударами судьбы, иль надо оказать сопротивленье?");

    }
}
