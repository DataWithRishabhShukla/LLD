package DesignPatterns.Factory.AudioPlayer;

public class MP3Player extends  AudioPlayer{

    public MP3Player(int volume, double playBackRate ){
        super(volume,playBackRate);
    }

    @Override
    public MediaFormat supportsType() {
        return MediaFormat.MP3;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 audio");

    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 audio");

    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 audio");

    }
}
