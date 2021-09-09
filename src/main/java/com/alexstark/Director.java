package com.alexstark;

public class Director extends Brief {


    public Director(String gender, String name, int age, String character, boolean isDrinker) {
        super(gender, name, age, character, isDrinker);
    }

    void directFilm(boolean isDrinker) {
        if (isDrinker) {
            System.out.println("Режиссер: Я слишком пьян, командуйте парадом сами... где мой РОМ????");
        } else {
            System.out.println("Режиссер:Камера,мотор,начали!");
        }
    }

}
