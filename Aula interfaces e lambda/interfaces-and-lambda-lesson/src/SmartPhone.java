public class SmartPhone implements VideoPlayer, MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("the SmartPhone is playing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("the SmartPhone is stopping video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("the SmartPhone is pausing video");
    }

    @Override
    public void playMusic() {
        System.out.println("the SmartPhone is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("the SmartPhone is stopping music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("the SmartPhone is pausing music");
    }
}