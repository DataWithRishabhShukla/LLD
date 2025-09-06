package DesignPatterns.Factory.AudioPlayer;

public class WAVPlayer extends AudioPlayer{
    public WAVPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public MediaFormat supportsType() {
        return MediaFormat.WAV;
    }

    @Override
    public void play() {
        System.out.println("Playing WAV audio");

    }

    @Override
    public void pause() {
        System.out.println("Pausing WAV audio");

    }

    @Override
    public void stop() {
        System.out.println("Stopping WAV audio");

    }
}
