package com.alexstark;

public class CinemaStudio {
    public static void main(String[] args) {
        Actor actor1 = new Actor("male", "Max", 31, "Calm", "Comedy");
        Actor actor2 = new Actor("female", "Kate", 25, "Obstinate", "Melodrama");
        Director director = new Director("male", "Leonid", 55, "Talented", "Action,Horror");
        Stuntman stuntman = new Stuntman("male", "Fedor", 29, "Fights", 180, 85);
        Camera camera = new Camera("medium-size", "", 108);


        System.out.println(actor1.name + " - " + actor1.age);
        System.out.println(actor2.name + " - " + actor2.age);

        actor1.playRole();
        actor2.playRole();

    }


}
