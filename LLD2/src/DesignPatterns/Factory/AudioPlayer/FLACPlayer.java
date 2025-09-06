package DesignPatterns.Factory.AudioPlayer;

public class FLACPlayer extends AudioPlayer{

    public FLACPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public MediaFormat supportsType() {
        return MediaFormat.FLAC;
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing FLAC audio");

    }

    @Override
    public void stop() {
        System.out.println("Stopping FLAC audio");
    }
}
