package com.kovanLabs.intern.AbstractInterface;
interface camera{
    default void start(){
        System.out.print("camera..");
    }
    void takePhoto();
}
interface MusicPlayer{
    void start();
    void playMusic();
}
interface Phone {
    void start();
    void makecall();
}
public class MultipleInterface implements camera,MusicPlayer,Phone{
    @Override
    public void start() {
        System.out.println("SmartPhone");
    }
    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }
    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }
    @Override
    public void makecall() {
        System.out.println("Making a call");
    }
}