package com.alexstark;

public class Actor extends Brief {

    public Actor(String gender, String name, int age, String character, String genre, boolean isFamous) {
        super(gender, name, age, character, genre, isFamous);
    }

    void playRole() {
        System.out.println("Актёр " + name + " начал(а) монолог: " + "Быть или не быть, вот в чем вопрос. " +
                "Достойно ль смиряться под ударами судьбы, иль надо оказать сопротивленье?");
    }

    void expressOpinion1() {
        System.out.println("Актёр " + name + ": И зачем я столько времени учил этот текст?");
    }

    void expressOpinion2() {
        System.out.println("Актёр " + name + ": Не нужно было режиссёру показывать свою заначку...");
    }
}
