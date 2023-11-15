package org.example;

public class Main {
    public static void main(String[] args) {
        MultiMediaFacade facade = new MultiMediaFacade();

        // Using the facade to play multimedia
        facade.playMultimedia("song.mp3", "audio");
        facade.playMultimedia("movie.mp4", "video");
        facade.playMultimedia("picture.jpg", "image");
    }
}