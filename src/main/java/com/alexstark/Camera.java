package com.alexstark;

public class Camera {
   protected String size;
   protected String type;
   protected int numberOfMpx;
   protected String [] cameraArray = {"Olympus","Fujifilm","Sony","Canon"};


    public Camera(String size, String type, int numberOfMpx) {
        this.size = size;
        this.type = type;
        this.numberOfMpx = numberOfMpx;
    }

    void shootMovie(boolean famousOfActor1, boolean famousOfActor2) {
        System.out.println("Камера: Съёмка фильма с помощью " + numberOfMpx + " магапиксельной камеры типа - " + type);
        for (int i = 0; i < cameraArray.length; i++) {
            if ((cameraArray[i].equals("Sony")) && (famousOfActor1 || famousOfActor2)) {
                System.out.println("Один из актеров знаменит,поэтому для съёмок используется камера: Sony");
            } else if (!(cameraArray[i].equals("Sony")) && (!(famousOfActor1 || famousOfActor2))) {
                System.out.println("Данные актёры не слишком известны,поэтому для съёмок используется камера: " + cameraArray[i]);
                break;
            }
        }
    }

    void doAwaiting(){
        System.out.println("Камера: В ожидании...режиссировать некому, снимать нечего...");
    }

}
