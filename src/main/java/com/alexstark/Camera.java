package com.alexstark;

public class Camera {
    String size;
    String type;
    int numberOfMpx;
    boolean isShootsUnderwater;

    public Camera(String size, String type, int numberOfMpx) {
        this.size = size;
        this.type = type;
        this.numberOfMpx = numberOfMpx;
        this.isShootsUnderwater = isShootsUnderwater;
    }

    void shootMovie() {
        System.out.println("Съёмка фильма с помощью "+numberOfMpx+" mpx камеры для локации типа: "+type);

    }



}
