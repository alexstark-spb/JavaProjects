package com.alexstark;

public class Brief {
    String gender;
    String name;
    int age;
    String character;
    String genre;
    String specialization;
    int height;
    int weight;

    public Brief(String gender, String name, int age, String character, String genre) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.character = character;
        this.genre = genre;
    }

    public Brief(String gender, String name, int age, String specialization, int height, int weight) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.height = height;
        this.weight = weight;
    }
}
