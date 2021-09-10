package com.alexstark;

import java.util.Scanner;

public class CinemaStudio {
    public static void main(String[] args) {
        Actor actor1 = new Actor("male", "Макс", 31, "Спокойный", "Комедия", false);
        Actor actor2 = new Actor("female", "Катя", 25, "Импульсивная", "Мелодрама", false);
        Director director = new Director("male", "Григорий", 55, "Неординарный", false);
        Stuntman stuntman = new Stuntman("male", "Фёдор", 29, "прыжки через огонь", 180, 85);
        Camera camera = new Camera("Большая", "Стационарная", 108);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, будет ли режиссер пьян. Введите 'да' или 'нет':)");
        String answer = scanner.next();

        if (answer.equals("да")) {
            director.directFilm(true);
            camera.doAwaiting();
            actor1.expressOpinion1();
            actor2.expressOpinion2();
            stuntman.waitingTrick();
            System.out.println("Съёмочная группа: Снимает пьяного режиссера в инстаграм :)");

        } else if (answer.equals("нет")) {
            System.out.println("Выберите, будет ли один из актеров известен. Введите 'да' или 'нет'");
            String answer2 = scanner.next();
            if (answer2.equals("да")) {
                actor1.isFamous = true;
                director.directFilm(false);
                camera.shootMovie(actor1.isFamous, actor2.isFamous);
                actor1.playRole();
                actor2.playRole();
                stuntman.performTrick();
                System.out.println("Аплодисменты от съёмочной группы");

            } else if (answer2.equals("нет")) {
                actor1.isFamous = false;
                director.directFilm(false);
                camera.shootMovie(actor1.isFamous, actor2.isFamous);
                actor1.playRole();
                actor2.playRole();
                stuntman.performTrick();
                System.out.println("Аплодисменты от съёмочной группы");
            }
        }
    }
}