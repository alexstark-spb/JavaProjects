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
        if (famousOfActor1 || famousOfActor2) {
            System.out.println("Для съёмок используется камера: " + cameraArray[2]);
        } else {
            System.out.println("Для съёмок используется камера: " + cameraArray[0]);
        }
    }

    void doAwaiting(){
        System.out.println("Камера: В ожидании...режиссировать некому, снимать нечего...");
    }



}
