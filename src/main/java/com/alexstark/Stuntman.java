package com.alexstark;

public class Stuntman extends Brief {

    public Stuntman(String gender, String name, int age, String specialization, int height, int weight) {
        super(gender, name, age, specialization, height, weight);
    }

    void performTrick() {
        System.out.println("Каскадёр: На заднем плане выполняет смертельный трюк");
    }

    void waitingTrick() {
        System.out.println("Каскадёр: Я не для того изучал " + specialization + " чтобы просиживать штаны. Увольняюсь!");
    }

}
