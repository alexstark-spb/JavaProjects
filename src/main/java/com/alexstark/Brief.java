package com.alexstark;

public class Brief {
   protected String gender;
   protected String name;
   protected int age;
   protected String character;
   protected String genre;
   protected String specialization;
   protected int height;
   protected int weight;
   protected boolean isFamous;
   protected boolean isDrinker;


    public Brief(String gender, String name, int age, String character, String genre, boolean isFamous) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.character = character;
        this.genre = genre;
        this.isFamous = isFamous;
    }

    public Brief(String gender, String name, int age, String character, boolean isDrinker) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.character = character;
        this.isDrinker = isDrinker;
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
