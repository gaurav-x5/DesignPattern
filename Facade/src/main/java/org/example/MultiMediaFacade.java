package org.example;

public class MultiMediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private ImageViewer imageViewer;

    public MultiMediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageViewer = new ImageViewer();
    }

    public void playMultimedia(String fileName, String type) {
        if (type.equalsIgnoreCase("audio")) {
            audioPlayer.playAudio(fileName);
        } else if (type.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else if (type.equalsIgnoreCase("image")) {
            imageViewer.viewImage(fileName);
        } else {
            System.out.println("Invalid multimedia type");
        }
    }
}
